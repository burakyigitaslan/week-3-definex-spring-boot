package com.patika.onlineshopping.controller;

import com.patika.onlineshopping.client.dto.response.InvoiceServiceResponse;
import com.patika.onlineshopping.dto.request.InvoiceRequest;
import com.patika.onlineshopping.service.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/invoices")
@RequiredArgsConstructor
public class InvoiceController {
    private final InvoiceService invoiceService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody InvoiceRequest request) {
        invoiceService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<InvoiceServiceResponse>> getAll() {
        return ResponseEntity.ok().body(invoiceService.getAll());
    }

}
