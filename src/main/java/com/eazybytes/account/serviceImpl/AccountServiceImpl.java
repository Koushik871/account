package com.eazybytes.account.serviceImpl;

import com.eazybytes.account.Dto.CustomerDto;
import com.eazybytes.account.Entity.Account;
import com.eazybytes.account.Entity.Customer;
import com.eazybytes.account.Entity.Product;
import com.eazybytes.account.Entity.Supplier;
import com.eazybytes.account.mapper.CustomerMapper;
import com.eazybytes.account.repository.AccountRepository;
import com.eazybytes.account.repository.CustomerRepository;
import com.eazybytes.account.service.AccountService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import java.util.stream.Collectors;


@Service
@Transactional
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {


    @Autowired
    public AccountRepository accRepo;

    @Autowired
    public CustomerRepository customerRepo;


    @Override
    public void createAccount(CustomerDto customerDto) {
        Customer customer = CustomerMapper.mapT0Customer(customerDto,new Customer());

        Customer savedCustomer = customerRepo.save(customer);

    }

    @Override
    public Account createAccount1(Account account){
        return accRepo.save(account);

    }
    @Override
    public void delete(String name) {
        accRepo.deleteByName(name);
    }

    @Override
    public CompletableFuture<Object> getProductDetails(String accName) {


        return null;
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
