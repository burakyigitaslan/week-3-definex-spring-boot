package com.patika.onlineshopping.service;

import com.patika.onlineshopping.client.OrderServiceClient;
import com.patika.onlineshopping.client.dto.request.OrderServiceRequest;
import com.patika.onlineshopping.client.dto.response.OrderServiceResponse;
import com.patika.onlineshopping.dto.request.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderServiceClient orderServiceClient;

    public OrderServiceResponse save(OrderRequest request) {
        return orderServiceClient.save(prepareOrderServiceRequest(request));
    }

    public OrderServiceRequest prepareOrderServiceRequest(OrderRequest request) {

        return new OrderServiceRequest(request);
    }

    public List<OrderServiceResponse> getAll() {
        return orderServiceClient.getAll();
    }
}

