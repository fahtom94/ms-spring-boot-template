package com.ipilum.discogs.app.client.model.order;

import lombok.Data;

@Data
class Shipping {

    private Currency currency;
    private String method;
    private Integer value;
}
