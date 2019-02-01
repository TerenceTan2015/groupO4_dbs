package model;

import java.util.*;

public class Transaction {
    private double balance;
    private String currency;
    private Date date;
    private String displayName;
    // Deposit Account
    private String transactionId;
    private int accountId;
    private String type;
    private double amount;
    private String tag;
    private String refNum;

    public Transaction() {
    }

    public Transaction(String transactionId, int accountId, String type, double amount, String tag, String refNum) {
	this.transactionId = transactionId;
	this.accountId = accountId;
	this.type = type;
	this.amount = amount;
	this.tag = tag;
	this.refNum = refNum;
    }

    public String getTransactionId() {
	return transactionId;
    }

    public void setTransactionId(String transactionId) {
	this.transactionId = transactionId;
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

    public double getAmount() {
	return amount;
    }

    public void setAmount(double amount) {
	this.amount = amount;
    }

    public String getTag() {
	return tag;
    }

    public void setTag(String tag) {
	this.tag = tag;
    }

    public String getRefNum() {
	return refNum;
    }

    public void setRefNum(String refNum) {
	this.refNum = refNum;
    }

    public Transaction(double balance, String currency, Date date, String displayName, String accountNumber) {
	this.balance = balance;
	this.currency = currency;
	this.date = date;
	this.displayName = displayName;
	this.accountNumber = accountNumber;
    }

    public double getBalance() {
	return balance;
    }

    public void setBalance(double balance) {
	this.balance = balance;
    }

    public String getCurrency() {
	return currency;
    }

    public void setCurrency(String currency) {
	this.currency = currency;
    }

    public Date getDate() {
	return date;
    }

    public void setDate(Date date) {
	this.date = date;
    }

    public String getDisplayName() {
	return displayName;
    }

    public void setDisplayName(String displayName) {
	this.displayName = displayName;
    }
}