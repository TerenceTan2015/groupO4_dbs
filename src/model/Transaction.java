package model;

import java.util.*;

public class Transaction {
    private double balance;
    private String currency;
    private Date date;
    private String displayName;
    private String accountNumber;

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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
