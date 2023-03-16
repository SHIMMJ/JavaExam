package com.simminjeong.praticeex.exam14;

public class Account {
    
    private String accountNumber;
    private int balance;
    

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "balance" + "원 (계좌번호=" + accountNumber + "))";
    }
    
//    @Override
//    public boolean equals(Object obj) {
//        obj.values().toString().trim();
//        return super.equals(obj);
//    }
    
    

}
