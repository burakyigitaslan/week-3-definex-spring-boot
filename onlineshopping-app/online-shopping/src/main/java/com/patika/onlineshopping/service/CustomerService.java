package com.patika.onlineshopping.service;

import com.patika.onlineshopping.client.CustomerServiceClient;
import com.patika.onlineshopping.client.dto.request.CustomerServiceRequest;
import com.patika.onlineshopping.client.dto.response.CustomerServiceResponse;
import com.patika.onlineshopping.dto.request.CustomerRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerServiceClient customerServiceClient;

    public CustomerServiceResponse save(CustomerRequest request) {
        return customerServiceClient.save(prepareCustomerServiceRequest(request));
    }

    public CustomerServiceRequest prepareCustomerServiceRequest(CustomerRequest request) {

        return new CustomerServiceRequest(request);
    }

    public List<CustomerServiceResponse> getAll() {
        return customerServiceClient.getAll();
    }

    /*public Customer getByEmail(String email) {
      Optional<Customer> foundCustomer = customerServiceClient.getByEmail(email);

       Customer customer = null;

       if (foundCustomer.isPresent()) {
            customer = foundCustomer.get();
        }

        return customer;
    }*/
}

