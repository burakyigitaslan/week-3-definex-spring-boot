package com.patika.onlineshopping.listener;

import com.patika.onlineshopping.client.InvoiceServiceClient;
import com.patika.onlineshopping.client.dto.request.InvoiceServiceRequest;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class InvoiceMessageListener {

    private final InvoiceServiceClient invoiceServiceClient;

    public InvoiceMessageListener(InvoiceServiceClient invoiceServiceClient) {
        this.invoiceServiceClient = invoiceServiceClient;
    }

    @RabbitListener(queues = "invoice-queue")
    public void receiveInvoiceMessage(InvoiceServiceRequest request) {
        invoiceServiceClient.save(request);
    }
}
