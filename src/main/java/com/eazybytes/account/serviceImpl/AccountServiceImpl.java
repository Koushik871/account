package com.eazybytes.account.serviceImpl;

import com.eazybytes.account.Entity.Account;
import com.eazybytes.account.Entity.Product;
import com.eazybytes.account.Entity.Supplier;
import com.eazybytes.account.repository.AccountRepository;
import com.eazybytes.account.service.AccountService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


@Service
@Transactional
public class AccountServiceImpl implements AccountService {


    @Autowired
    public AccountRepository accRepo;

    @Override
    public Account createAccount(Account account){
        return accRepo.save(account);

    }
    @Override
    public void delete(String name) {
        accRepo.deleteByName(name);
    }


//    public Map<Product, Supplier> matchProductWithSupplier(List<Product> productList, List<Supplier> supplierList){
//
//        Map<Product, Supplier> productSupplierMap;
//        productSupplierMap = productList.stream()// Filter products with valid supplier IDs
//                .collect(Collectors.toMap(
//                        Function.identity(),
//                        product -> supplierList.stream()
//                                .filter(supplier -> supplier.getId() == product.getSupplierId())
//                                .findFirst()
//                                .orElse(null)));
//        return productSupplierMap;
//    }




}
