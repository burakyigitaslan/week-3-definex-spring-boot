package com.patika.onlineshopping.controller;

import com.patika.onlineshopping.client.dto.response.ProductServiceResponse;
import com.patika.onlineshopping.dto.request.ProductRequest;
import com.patika.onlineshopping.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ProductServiceResponse> save(@RequestBody ProductRequest request) {
        return ResponseEntity.ok().body(productService.save(request));
    }

    @GetMapping
    public ResponseEntity<List<ProductServiceResponse>> getAll() {
        return ResponseEntity.ok().body(productService.getAll());
    }

}
