package com.ipilum.discogs.app.client.model.order;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Order {

    private String id;
    @JsonProperty("resource_url")
    private String resourceUrl;
    @JsonProperty("message_url")
    private String messageUrl;
    private String uri;
    private String status;
    @JsonProperty("next_status")
    private String nextStatus; //TODO make to enum with value
    private Fee fee;
    private LocalDateTime created;
    private List<Item> items;
    private Shipping shipping;
    @JsonProperty("shipping_address")
    private String shippingAddress;
    @JsonProperty("additional_instructions")
    private String additionalInstructions;
    private Seller seller;
    @JsonProperty("last_activity")
    private LocalDateTime lastActivity;
    private Buyer buyer;
    private Total total;

}
