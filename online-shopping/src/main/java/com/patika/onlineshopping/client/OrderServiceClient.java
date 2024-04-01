package com.patika.onlineshopping.client;

import com.patika.onlineshopping.client.dto.request.CustomerServiceRequest;
import com.patika.onlineshopping.client.dto.request.OrderServiceRequest;
import com.patika.onlineshopping.client.dto.response.CustomerServiceResponse;
import com.patika.onlineshopping.client.dto.response.OrderServiceResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value="order-service", url = "localhost:8083")
public interface OrderServiceClient {
    @PostMapping("/api/orders")
    OrderServiceResponse save(@RequestBody OrderServiceRequest request);

    @GetMapping("/api/orders")
    List<OrderServiceResponse> getAll();
}
