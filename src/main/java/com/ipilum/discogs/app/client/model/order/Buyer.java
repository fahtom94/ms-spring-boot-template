package com.ipilum.discogs.app.client.model.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
class Buyer {

    @JsonProperty("resource_url")
    private String resourceUrl;
    private String username;
    private Long id;

}
