package com.ipilum.discogs.app.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipilum.discogs.app.client.DiscogsApi;
import com.ipilum.discogs.app.client.model.order.Order;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/discogs/v1/")
@AllArgsConstructor
public class DiscogsController {

    private final DiscogsApi discogsApi;

    @GetMapping("/orders/{order_id}")
    public ResponseEntity<Order> getOrder(@PathVariable("order_id") String orderId) {
        return ResponseEntity.ok(discogsApi.getOrder(orderId));
    }

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getOrders() {
        return ResponseEntity.ok(discogsApi.getOrders());
    }
}
