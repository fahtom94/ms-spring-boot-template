package com.ipilum.discogs.app.client.model.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
class Item {

    private Release release;
    private Price price;
    @JsonProperty("media_condition")
    private String mediaCondition;
    @JsonProperty("sleeveCondition")
    private String sleeve_condition;
    private Long id;

}
