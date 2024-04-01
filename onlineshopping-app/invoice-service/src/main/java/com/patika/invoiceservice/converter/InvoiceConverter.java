package com.patika.invoiceservice.converter;

import com.patika.invoiceservice.dto.request.InvoiceRequest;
import com.patika.invoiceservice.dto.response.InvoiceResponse;
import com.patika.invoiceservice.entity.Invoice;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InvoiceConverter {
    public Invoice toInvoice(InvoiceRequest request){
        return new Invoice(request);
    }

    public InvoiceResponse toResponse(Invoice invoice){
        return InvoiceResponse.builder()
                .invoiceId(invoice.getInvoiceId())
                .createDate(invoice.getCreateDate())
                .build();
    }

    public List<InvoiceResponse> toResponseList(List<Invoice> invoices){
        List<InvoiceResponse> invoiceResponses = new ArrayList<>();

        invoices.forEach(invoice -> {
            invoiceResponses.add(toResponse(invoice));
        });

        return invoiceResponses;
    }
}
