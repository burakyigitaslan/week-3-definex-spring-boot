package com.patika.orderservice.service;

import com.patika.orderservice.converter.OrderConverter;
import com.patika.orderservice.dto.request.OrderRequest;
import com.patika.orderservice.dto.response.OrderResponse;
import com.patika.orderservice.entity.Order;
import com.patika.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository = new OrderRepository();

    private final OrderConverter orderConverter;

    public OrderResponse save(OrderRequest request) {

        Order order = orderConverter.toOrder(request);

        return orderConverter.toResponse(orderRepository.save(order));
    }


    public List<OrderResponse> getAll() {
        List<Order> orders = orderRepository.getAll();

        return orderConverter.toResponseList(orders);
    }
}
