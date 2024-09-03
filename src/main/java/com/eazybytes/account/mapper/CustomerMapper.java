package com.eazybytes.account.mapper;

import com.eazybytes.account.Dto.CustomerDto;
import com.eazybytes.account.Entity.Customer;

public class CustomerMapper {
    public static CustomerDto mapT0CustomerDto(Customer customer,CustomerDto customerDto){

        customerDto.setEmail(customer.getEmail());
        customerDto.setName(customer.getName());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }
    public static Customer mapT0Customer(CustomerDto customerDto,Customer customer){

        customer.setEmail(customerDto.getEmail());
        customer.setName(customerDto.getName());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }
}
