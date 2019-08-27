package com.ipilum.discogs.app.client;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OAuth2RequestInterceptor implements RequestInterceptor {
    private final String username;
    private final String password;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        final String userPass = "key=" + username + ", secret=" + password;
        requestTemplate.header("Authorization", "Discogs " + userPass);
    }
}
