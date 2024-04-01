package com.patika.onlineshopping.service;

import com.patika.onlineshopping.client.InvoiceServiceClient;
import com.patika.onlineshopping.client.dto.request.InvoiceServiceRequest;
import com.patika.onlineshopping.client.dto.response.InvoiceServiceResponse;
import com.patika.onlineshopping.dto.request.InvoiceRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InvoiceService {
    private final InvoiceServiceClient invoiceServiceClient;

    public InvoiceServiceResponse save(InvoiceRequest request) {
        return invoiceServiceClient.save(prepareInvoiceServiceRequest(request));
    }

    public InvoiceServiceRequest prepareInvoiceServiceRequest(InvoiceRequest request) {

        return new InvoiceServiceRequest(request);
    }

    public List<InvoiceServiceResponse> getAll() {
        return invoiceServiceClient.getAll();
    }
}

