package com.patika.onlineshopping.client.dto.request;

import com.patika.onlineshopping.dto.request.CustomerRequest;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerServiceRequest {
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String email;
    private String password;
    private String phoneNumber;
    //private List<Order> orderList;
    private String address;
    private boolean isActive;

    public CustomerServiceRequest(CustomerRequest request){
        this.name=request.getName();
        this.surname=request.getSurname();
        this.birthDate=request.getBirthDate();
        this.email = request.getEmail();
        this.password=request.getPassword();
        this.phoneNumber=request.getPhoneNumber();
        //this.orderList=request.getOrderList();
        this.address=request.getAddress();
        this.isActive=request.isActive();
    }
}
