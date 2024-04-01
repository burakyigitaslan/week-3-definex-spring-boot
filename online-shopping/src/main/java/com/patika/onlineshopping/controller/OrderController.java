package com.patika.onlineshopping.controller;

import com.patika.onlineshopping.client.dto.response.OrderServiceResponse;
import com.patika.onlineshopping.dto.request.OrderRequest;
import com.patika.onlineshopping.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<OrderServiceResponse> save(@RequestBody OrderRequest request) {
        return ResponseEntity.ok().body(orderService.save(request));
    }

    @GetMapping
    public ResponseEntity<List<OrderServiceResponse>> getAll() {
        return ResponseEntity.ok().body(orderService.getAll());
    }

}
