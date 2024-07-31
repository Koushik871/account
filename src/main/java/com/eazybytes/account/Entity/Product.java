package com.eazybytes.account.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Qualifier;

@Entity
@Qualifier("datasource2")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int supplierId;

    // Default constructor required by JPA
    public Product() {}

    public Product(int id, String name, int supplierId) {
        this.id = id;
        this.name = name;
        this.supplierId = supplierId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSupplierId() {
        return supplierId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", supplierId=" + supplierId +
                '}';
    }
}
