package com.abi.commons.model;

import javax.persistence.*;

@Entity
@Table(name = "customer")
//@Data from lambok project. no need to add getters and setters when using with this annotaion.
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String firstName;
    String lastName;
    String dlNumber;

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDlNumber(String dlNumber) {
        this.dlNumber = dlNumber;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    String zipCode;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDlNumber() {
        return dlNumber;
    }

    public String getZipCode() {
        return zipCode;
    }


}
