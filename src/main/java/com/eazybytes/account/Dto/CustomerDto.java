package com.eazybytes.account.Dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class CustomerDto {


    private String name;
    private String email;
    private int mobileNumber;



}
