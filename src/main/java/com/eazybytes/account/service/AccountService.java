package com.eazybytes.account.service;


import com.eazybytes.account.Entity.Account;
import org.springframework.stereotype.Service;


public interface AccountService {

    public Account createAccount(Account account);
    public void delete(String name);
}
