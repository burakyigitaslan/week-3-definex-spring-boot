package com.patika.customerservice.dto.request;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerRequest {
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String email;
    private String password;
    private String phoneNumber;
    //private List<Order> orderList;
    private String address;
    private boolean isActive;
}
