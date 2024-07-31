package com.eazybytes.account.repository;


import com.eazybytes.account.Entity.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Qualifier("datasource2")
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
