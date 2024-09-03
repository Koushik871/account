package com.eazybytes.account.controller;

import com.eazybytes.account.Dto.CustomerDto;
import com.eazybytes.account.Dto.ResponseDto;
import com.eazybytes.account.Entity.Account;
import com.eazybytes.account.constants.AccountsConstants;
import com.eazybytes.account.service.AccountService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@Tag(name = "Account-Service",description = "Account EndPoints")
@RequestMapping(path="api/v1/",produces= MediaType.APPLICATION_JSON_VALUE)
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
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto){
//        Account savAccount= service.createAccount(account);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto(AccountsConstants.STATUS_201,AccountsConstants.MESSAGE_201));
    }




    @PostMapping(value ="/create")
    public ResponseEntity<Account> createAccount1(@RequestBody Account account){
        Account savAccount= service.createAccount1(account);
        return ResponseEntity.status(HttpStatus.CREATED).body(savAccount);
    }

    @DeleteMapping(value="/delete/{name}")
    public ResponseEntity<String> deleteAcc(@PathVariable String name){
          service.delete(name);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/details/{accName}")
    public CompletableFuture<ResponseEntity<Object>> getdetails(@PathVariable String accName){

        return service.getProductDetails(accName).thenApply(ResponseEntity::ok);
    }




}
