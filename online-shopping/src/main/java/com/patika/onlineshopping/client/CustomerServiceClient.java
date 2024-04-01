package com.patika.onlineshopping.client;

import com.patika.onlineshopping.client.dto.request.CustomerServiceRequest;
import com.patika.onlineshopping.client.dto.response.CustomerServiceResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value="customer-service", url = "localhost:8081")
public interface CustomerServiceClient {
    @PostMapping("/api/customers")
    CustomerServiceResponse save(@RequestBody CustomerServiceRequest request);

    @GetMapping("/api/customers")
    List<CustomerServiceResponse> getAll();
}
