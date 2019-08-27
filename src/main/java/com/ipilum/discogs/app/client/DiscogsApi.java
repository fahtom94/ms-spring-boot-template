package com.ipilum.discogs.app.client;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ipilum.discogs.app.client.model.order.Order;

@RequestMapping(value = "marketplace")
public interface DiscogsApi {

    @GetMapping("/orders/{order_id}")
    Order getOrder(@PathVariable("order_id") String orderId);

    @GetMapping("/orders")
    List<Order> getOrders();
}
