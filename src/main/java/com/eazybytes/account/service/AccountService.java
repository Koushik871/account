package com.eazybytes.account.service;


import com.eazybytes.account.Entity.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;


public interface AccountService {

    public Account createAccount(Account account);
    public void delete(String name);

    CompletableFuture<Object> getProductDetails(String accName);
}
