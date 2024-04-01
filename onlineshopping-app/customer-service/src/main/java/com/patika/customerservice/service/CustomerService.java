package com.patika.customerservice.service;

import com.patika.customerservice.converter.CustomerConverter;
import com.patika.customerservice.dto.request.CustomerRequest;
import com.patika.customerservice.dto.response.CustomerResponse;
import com.patika.customerservice.entity.Customer;
import com.patika.customerservice.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository = new CustomerRepository();

    private final CustomerConverter customerConverter;

    public CustomerResponse save(CustomerRequest request) {

        Customer customer = customerConverter.toCustomer(request);

        return customerConverter.toResponse(customerRepository.save(customer));
    }


    public List<CustomerResponse> getAll() {
        List<Customer> customers = customerRepository.getAll();

        return customerConverter.toResponseList(customers);
    }
}
