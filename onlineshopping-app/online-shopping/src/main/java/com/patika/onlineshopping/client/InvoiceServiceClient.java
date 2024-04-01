package com.patika.onlineshopping.client;

import com.patika.onlineshopping.client.dto.request.CustomerServiceRequest;
import com.patika.onlineshopping.client.dto.request.InvoiceServiceRequest;
import com.patika.onlineshopping.client.dto.response.CustomerServiceResponse;
import com.patika.onlineshopping.client.dto.response.InvoiceServiceResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value="invoice-service", url = "localhost:8082")
public interface InvoiceServiceClient {
    @PostMapping("/api/invoices")
    InvoiceServiceResponse save(@RequestBody InvoiceServiceRequest request);

    @GetMapping("/api/invoices")
    List<InvoiceServiceResponse> getAll();
}
