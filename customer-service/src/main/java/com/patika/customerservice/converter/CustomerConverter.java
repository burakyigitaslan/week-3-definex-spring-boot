package com.patika.customerservice.converter;

import com.patika.customerservice.dto.request.CustomerRequest;
import com.patika.customerservice.dto.response.CustomerResponse;
import com.patika.customerservice.entity.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerConverter {
    public Customer toCustomer(CustomerRequest request){
        return new Customer(request);
    }

    public CustomerResponse toResponse(Customer customer){
        return CustomerResponse.builder()
                .customerId(customer.getCustomerId())
                .createDate(customer.getCreateDate())
                .build();
    }

    public List<CustomerResponse> toResponseList(List<Customer> customers){
        List<CustomerResponse> customerResponses = new ArrayList<>();

        customers.forEach(customer -> {
            customerResponses.add(toResponse(customer));
        });

        return customerResponses;
    }
}
