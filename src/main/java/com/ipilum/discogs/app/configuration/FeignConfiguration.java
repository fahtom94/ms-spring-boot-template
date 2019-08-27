package com.ipilum.discogs.app.configuration;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ipilum.discogs.app.client.DiscogsApi;
import com.ipilum.discogs.app.client.OAuth2RequestInterceptor;
import feign.Client;
import feign.Contract;
import feign.Feign;
import feign.Logger;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.okhttp.OkHttpClient;
import lombok.RequiredArgsConstructor;

@Configuration
@Import(FeignClientsConfiguration.class)
@EnableFeignClients
@RequiredArgsConstructor
public class FeignConfiguration {

    @Value("${discogs.client.username}")
    private String username;
    @Value("${discogs.client.password}")
    private String password;

    @Bean
    public DiscogsApi discogsApi(Contract contract, Encoder encoder, Decoder decoder) {
        return Feign.builder()
                .client(new OkHttpClient())
                .contract(contract)
                .encoder(encoder)
                .decoder(decoder)
                .logLevel(Logger.Level.FULL)
                .requestInterceptors(List.of(new OAuth2RequestInterceptor(username, password)))
                .target(DiscogsApi.class, "https://api.discogs.com");
    }
}
