package com.eazybytes.account.mapper;

import com.eazybytes.account.Dto.AccountDto;
import com.eazybytes.account.Entity.Account;

public class AccountsMapper {

    public static AccountDto mapToAccountDto(Account account,AccountDto accountDto){
        accountDto.setAccName(account.getAccName());
        accountDto.setBranchAddress(account.getBranchAddress());
        accountDto.setAccNo(account.getAccNo());
            return accountDto;
    }

    public static Account mapToAccount(AccountDto accountDto,Account account){

        account.setAccName(accountDto.getAccName());
        account.setBranchAddress(accountDto.getBranchAddress());
        account.setAccNo(accountDto.getAccNo());
        return account;
    }
}
