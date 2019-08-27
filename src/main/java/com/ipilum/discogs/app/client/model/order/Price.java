package com.ipilum.discogs.app.client.model.order;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Price {

    private Currency currency;
    private BigDecimal value;
}
