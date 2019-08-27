package com.ipilum.discogs.app.client.model.order;

import java.math.BigDecimal;

import lombok.Data;

@Data
class Total {
    private Currency currency;
    private BigDecimal value;
}
