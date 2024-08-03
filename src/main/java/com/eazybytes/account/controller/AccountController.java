package com.eazybytes.account.controller;

import com.eazybytes.account.Entity.Account;
import com.eazybytes.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    @Autowired
    private AccountService service;

    @GetMapping(value ="/sayHello")
    public String sayHello(){
        System.out.println("New String with docker");
        return "Say Hello New Dude";
    }

    @PostMapping(value ="/create")
    public ResponseEntity<Account> createAccount(@RequestBody Account account){
        Account savAccount= service.createAccount(account);
        return ResponseEntity.status(HttpStatus.CREATED).body(savAccount);
    }

    @DeleteMapping(value="/delete/{name}")
    public ResponseEntity<String> deleteAcc(@PathVariable String name){
          service.delete(name);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
