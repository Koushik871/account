package com.eazybytes.account.repository;


import com.eazybytes.account.Entity.Account;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("datasource1")
public interface AccountRepository extends JpaRepository<Account,Long> {


    @Modifying
    @Transactional
    @Query(value ="DELETE from account where acc_name LIKE %:name%",nativeQuery=true)
    public void deleteByName(@Param("name") String name);
}
