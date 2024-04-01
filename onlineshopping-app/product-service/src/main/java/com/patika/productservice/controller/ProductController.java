package com.patika.productservice.controller;

import com.patika.productservice.dto.request.ProductRequest;
import com.patika.productservice.dto.response.ProductResponse;
import com.patika.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ProductResponse save(@RequestBody ProductRequest request) {
        return productService.save(request);
    }

    @GetMapping
    public List<ProductResponse> getAll() {
        return productService.getAll();
    }

}
