package model;

import java.util.*;

public class Account {
    private String accountId;
    private String type;
    private String displayName;
    private String accountNumber;

    public Account(String accountId, String type, String displayName, String accountNumber) {
        this.accountId = accountId;
        this.type = type;
        this.displayName = displayName;
        this.accountNumber = accountNumber;
    }

    public Account() {
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}
