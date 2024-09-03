package com.eazybytes.account.service;


import com.eazybytes.account.Dto.CustomerDto;
import com.eazybytes.account.Entity.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;


public interface AccountService {



    void createAccount(CustomerDto customerDto);

    public Account createAccount1(Account account);
    public void delete(String name);

    CompletableFuture<Object> getProductDetails(String accName);
}
