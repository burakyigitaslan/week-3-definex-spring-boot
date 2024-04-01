package com.patika.invoiceservice.repository;

import com.patika.invoiceservice.entity.Invoice;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InvoiceRepository {
    private final List<Invoice> invoiceList = new ArrayList<>();

    public Invoice save(Invoice invoice) {
        invoiceList.add(invoice);
        return invoice;
    }

    public List<Invoice> getAll() {
        return invoiceList;
    }
}
