package com.eazybytes.account.configuartion;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;
//
//@Configuration
//@EnableJpaRepositories()
public class JpaConfig {


//
//        public LocalContainerEntityManagerFactoryBean entityManagerFactory1(EntityManagerFactoryBuilder builder, @Qualifier("datasource1")DataSource datasource){
//            return builder.dataSource(datasource).packages("com.example.entity").




//    }


}
