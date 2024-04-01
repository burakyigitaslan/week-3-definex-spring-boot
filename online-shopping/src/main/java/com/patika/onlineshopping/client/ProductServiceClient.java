package com.patika.onlineshopping.client;

import com.patika.onlineshopping.client.dto.request.CustomerServiceRequest;
import com.patika.onlineshopping.client.dto.request.ProductServiceRequest;
import com.patika.onlineshopping.client.dto.response.CustomerServiceResponse;
import com.patika.onlineshopping.client.dto.response.ProductServiceResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value="product-service", url = "localhost:8084")
public interface ProductServiceClient {
    @PostMapping("/api/products")
    ProductServiceResponse save(@RequestBody ProductServiceRequest request);

    @GetMapping("/api/products")
    List<ProductServiceResponse> getAll();
}
