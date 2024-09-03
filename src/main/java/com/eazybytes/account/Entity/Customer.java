package com.eazybytes.account.Entity;


import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name="Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    @Column(name ="mobile_number")
    private int mobileNumber;

}
