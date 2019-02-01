package model;

import java.util.*;

public class Account {
    private int custId;
    private int accountId;
    private String type;
    private String displayName;
    private int accountNumber;
    private int cardNumber = -1; // Default: -1; Deposit Account no card number

    public Account() {
    }

    public Account(int custId, int accountId, String type, String displayName, int accountNumber, int cardNumber) {
	this.custId = custId;
	this.accountId = accountId;
	this.type = type;
	this.displayName = displayName;
	this.accountNumber = accountNumber;
	this.cardNumber = cardNumber;
    }

    public int getCustId() {
	return custId;
    }

    public void setCustId(int custId) {
	this.custId = custId;
    }

    public int getAccountId() {
	return accountId;
    }

    public void setAccountId(int accountId) {
	this.accountId = accountId;
    }

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }

    public String getDisplayName() {
	return displayName;
    }

    public void setDisplayName(String displayName) {
	this.displayName = displayName;
    }

    public int getAccountNumber() {
	return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
    }

    public int getcardNumber() {
	return cardNumber;
    }

    public void setAccountNumber(int cardNumber) {
	this.cardNumber = cardNumber;
    }
}