package com.eazybytes.account.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;


@Entity
@Table(name="Employees")
public class Employee {

        private Long id;
        private String empName;
        private Boolean trainingStatus;
        private Boolean newJoiner;
        private String Salary;
        private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Boolean getTrainingStatus() {
        return trainingStatus;
    }

    public void setTrainingStatus(Boolean trainingStatus) {
        this.trainingStatus = trainingStatus;
    }

    public Boolean getNewJoiner() {
        return newJoiner;
    }

    public void setNewJoiner(Boolean newJoiner) {
        this.newJoiner = newJoiner;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(Long id, String empName, Boolean trainingStatus, Boolean newJoiner, String salary, int age) {
        this.id = id;
        this.empName = empName;
        this.trainingStatus = trainingStatus;
        this.newJoiner = newJoiner;
        Salary = salary;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(empName, employee.empName) && Objects.equals(Salary, employee.Salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empName, age);
    }
}
