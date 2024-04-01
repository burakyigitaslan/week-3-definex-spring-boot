package com.patika.orderservice.controller;

import com.patika.orderservice.dto.request.OrderRequest;
import com.patika.orderservice.dto.response.OrderResponse;
import com.patika.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public OrderResponse save(@RequestBody OrderRequest request) {
        return orderService.save(request);
    }

    @GetMapping
    public List<OrderResponse> getAll() {
        return orderService.getAll();
    }

}
