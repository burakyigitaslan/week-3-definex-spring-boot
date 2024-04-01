package com.patika.customerservice.repository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import com.patika.customerservice.entity.Customer;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {
    private final List<Customer> customerList = new ArrayList<>();

    public Customer save(Customer customer) {
        customerList.add(customer);
        return customer;
    }

    public List<Customer> getAll() {
        return customerList;
    }
}
