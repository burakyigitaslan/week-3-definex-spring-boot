package com.patika.onlineshopping.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.patika.onlineshopping.client.InvoiceServiceClient;
import com.patika.onlineshopping.client.dto.request.InvoiceServiceRequest;
import com.patika.onlineshopping.client.dto.response.InvoiceServiceResponse;
import com.patika.onlineshopping.dto.request.InvoiceRequest;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {
    private final InvoiceServiceClient invoiceServiceClient;
    private final RabbitTemplate rabbitTemplate;
    private final ObjectMapper objectMapper;

    @Autowired
    public InvoiceService(RabbitTemplate rabbitTemplate, InvoiceServiceClient invoiceServiceClient, ObjectMapper objectMapper) {
        this.invoiceServiceClient=invoiceServiceClient;
        this.rabbitTemplate = rabbitTemplate;
        this.objectMapper=objectMapper;
    }


    public void save(InvoiceRequest request) {
        try {
            // Convert the object to a byte array
            byte[] payload = objectMapper.writeValueAsBytes(prepareInvoiceServiceRequest(request));

            // Publish the byte array to RabbitMQ
            rabbitTemplate.convertAndSend("invoice-exchange", "invoice-queue", payload);
        } catch (Exception e) {
            // Handle serialization or RabbitMQ publishing errors
            e.printStackTrace();
        }
    }

    public InvoiceServiceRequest prepareInvoiceServiceRequest(InvoiceRequest request) {

        return new InvoiceServiceRequest(request);
    }

    public List<InvoiceServiceResponse> getAll() {
        return invoiceServiceClient.getAll();
    }
}

