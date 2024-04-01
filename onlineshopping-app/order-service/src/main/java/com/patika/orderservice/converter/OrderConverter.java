package com.patika.orderservice.converter;

import com.patika.orderservice.dto.request.OrderRequest;
import com.patika.orderservice.dto.response.OrderResponse;
import com.patika.orderservice.entity.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderConverter {
    public Order toOrder(OrderRequest request){
        return new Order(request);
    }

    public OrderResponse toResponse(Order order){
        return OrderResponse.builder()
                .orderId(order.getOrderId())
                .createDate(order.getCreateDate())
                .build();
    }

    public List<OrderResponse> toResponseList(List<Order> orders){
        List<OrderResponse> orderResponses = new ArrayList<>();

        orders.forEach(order -> {
            orderResponses.add(toResponse(order));
        });

        return orderResponses;
    }
}
