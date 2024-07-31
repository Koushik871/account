package com.eazybytes.account.configuartion;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.beans.ConstructorProperties;


public class DatasourceConfiguration {

    @Bean(name = "datasource1")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource primaryDataSource(){

        return DataSourceBuilder.create().build();
    }

    @Bean(name ="datasource2")
    @ConfigurationProperties(prefix="spring.secondDatasource")
    public DataSource secondDataSource(){

        return DataSourceBuilder.create().build();
    }


//    @Bean
//    @Primary
//    public EntityManagerFactoryBuilder builder

}
