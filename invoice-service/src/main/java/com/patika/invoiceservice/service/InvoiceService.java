package com.patika.invoiceservice.service;

import com.patika.invoiceservice.converter.InvoiceConverter;
import com.patika.invoiceservice.dto.request.InvoiceRequest;
import com.patika.invoiceservice.dto.response.InvoiceResponse;
import com.patika.invoiceservice.entity.Invoice;
import com.patika.invoiceservice.repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InvoiceService {
    private final InvoiceRepository invoiceRepository = new InvoiceRepository();

    private final InvoiceConverter invoiceConverter;

    public InvoiceResponse save(InvoiceRequest request) {

        Invoice invoice = invoiceConverter.toInvoice(request);

        return invoiceConverter.toResponse(invoiceRepository.save(invoice));
    }


    public List<InvoiceResponse> getAll() {
        List<Invoice> invoices = invoiceRepository.getAll();

        return invoiceConverter.toResponseList(invoices);
    }
}
