package com.patika.onlineshopping.controller;

import com.patika.onlineshopping.client.dto.response.CustomerServiceResponse;
import com.patika.onlineshopping.dto.request.CustomerRequest;
import com.patika.onlineshopping.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<CustomerServiceResponse> save(@RequestBody CustomerRequest request) {
        return ResponseEntity.ok().body(customerService.save(request));
    }

    @GetMapping
    public ResponseEntity<List<CustomerServiceResponse>> getAll() {
        return ResponseEntity.ok().body(customerService.getAll());
    }

    /*@GetMapping("/{email}")
    public Customer getByEmail(@PathVariable String email) {
        return customerService.getByEmail(email);
    }*/
}
