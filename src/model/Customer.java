package model;

import java.util.*;

public class Customer {
    private String name;
    private String customerId;
    private String dateOfBirth;
    private ArrayList<Account> accounts;

    public Customer(String name, String customerId, String dateOfBirth, ArrayList<Account> accounts) {
        this.name = name;
        this.customerId = customerId;
        this.dateOfBirth = dateOfBirth;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
}
