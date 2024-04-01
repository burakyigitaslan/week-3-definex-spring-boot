package com.patika.invoiceservice.controller;

import com.patika.invoiceservice.dto.request.InvoiceRequest;
import com.patika.invoiceservice.dto.response.InvoiceResponse;
import com.patika.invoiceservice.service.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/invoices")
@RequiredArgsConstructor
public class InvoiceController {
    private final InvoiceService invoiceService;

    @PostMapping
    public InvoiceResponse save(@RequestBody InvoiceRequest request) {
        return invoiceService.save(request);
    }

    @GetMapping
    public List<InvoiceResponse> getAll() {
        return invoiceService.getAll();
    }

}
