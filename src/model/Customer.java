package model;

import java.util.*;

public class Customer {
    private String name;
    private int custId;
    private String dateOfBirth;
    private ArrayList<Account> accounts;

    public Customer(String name, int custId, String dateOfBirth, ArrayList<Account> accounts) {
	this.name = name;
	this.custId = custId;
	this.dateOfBirth = dateOfBirth;
	this.accounts = accounts;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getCustId() {
	return custId;
    }

    public void setCustId(int custId) {
	this.custId = custId;
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