package com.patika.orderservice.repository;

import com.patika.orderservice.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {
    private final List<Order> orderList = new ArrayList<>();

    public Order save(Order order) {
        orderList.add(order);
        return order;
    }

    public List<Order> getAll() {
        return orderList;
    }
}
