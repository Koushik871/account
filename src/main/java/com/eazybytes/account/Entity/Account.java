package com.eazybytes.account.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Entity
@Table(name ="account")
public class Account {
            @Id
            @GeneratedValue(strategy=GenerationType.IDENTITY)
            private Long Id;
            private String accName;
            private Long accNo;
            private String branchAddress;
}
