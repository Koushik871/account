package com.eazybytes.account.Entity;


import jakarta.persistence.*;

@Entity
@Table(name ="account")
public class Account {

            @Id
            @GeneratedValue(strategy=GenerationType.IDENTITY)
            private Long Id;
            private String accName;
            private Long accNo;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getAccNo() {
        return accNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void setAccNo(Long accNo) {
        this.accNo = accNo;
    }

    @Override
    public String toString() {
        return "Account{" +
                "Id=" + Id +
                ", accName='" + accName + '\'' +
                ", accNo=" + accNo +
                '}';
    }


}
