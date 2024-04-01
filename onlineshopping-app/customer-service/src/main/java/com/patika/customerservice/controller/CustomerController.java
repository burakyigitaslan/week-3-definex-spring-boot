package com.patika.customerservice.controller;

import com.patika.customerservice.dto.request.CustomerRequest;
import com.patika.customerservice.dto.response.CustomerResponse;
import com.patika.customerservice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    public CustomerResponse save(@RequestBody CustomerRequest request) {
        return customerService.save(request);
    }

    @GetMapping
    public List<CustomerResponse> getAll() {
        return customerService.getAll();
    }

}
