package com.mycompany.musicapp;

/**
 *
 * @author zemor
 */
public class Seller { // продавец 

    private String lastName;
    private String firstName;
    private String surName;
    private String fullName;

    public Seller(String lastName, String firstName, String surName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.surName = surName;
        this.fullName = lastName + " " + firstName + " " + surName;
    }

    public Seller() {
        lastName = null;
        firstName = null;
        surName = null;
        fullName = null;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
