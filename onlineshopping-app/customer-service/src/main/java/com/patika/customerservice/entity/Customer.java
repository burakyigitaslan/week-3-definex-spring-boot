package com.patika.customerservice.entity;

import com.patika.customerservice.dto.request.CustomerRequest;
import lombok.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;


@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Getter
    @Setter
    private Long customerId;

    @Getter
    @Setter
    private LocalDateTime createDate;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String email;
    private String password;
    private String phoneNumber;
    //private List<Order> orderList;
    private String address;
    private boolean isActive;
    private static final Set<String> registeredEmails = new HashSet<>();


    public Customer(CustomerRequest request){
        this.customerId=new Random().nextLong();
        this.createDate=LocalDateTime.now();
        this.name=request.getName();
        this.surname=request.getSurname();
        this.birthDate=request.getBirthDate();
        setEmail(request.getEmail());
        setPassword(request.getPassword());
        this.phoneNumber=request.getPhoneNumber();
        //this.orderList=request.getOrderList();
        this.address=request.getAddress();
        this.isActive=request.isActive();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (registeredEmails.contains(email)) {
            throw new IllegalArgumentException("Email is already registered");
        }
        this.email = email;
        registeredEmails.add(email);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String hashedPassword;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            byte[] bytes = messageDigest.digest(password.getBytes());
            StringBuilder result = new StringBuilder();
            for (byte aByte : bytes) {
                result.append(String.format("%02x", aByte));
            }
            hashedPassword = result.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        this.password = hashedPassword;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /*public List<Order> getOrderList() {
        return orderList;
    }*/

    /*public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }*/

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    /*public void placeOrder(Order order) {
        orderList.add(order);
    }*/

    public Integer calculateAge() {
        return LocalDate.now().getYear() - birthDate.getYear();
    }
}

