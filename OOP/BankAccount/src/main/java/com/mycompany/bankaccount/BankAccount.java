package com.mycompany.bankaccount;

public class BankAccount {

    private int accountNo;
    private String clientName;
    private double balance;
    private String address;

    public BankAccount(int accountNo, String clientName, double balance, String address) {
        this.accountNo = accountNo;
        this.clientName = clientName;
        this.balance = balance;
        this.address = address;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public String getInfo() {
        return "Account Number: " + accountNo
                + "\nClient Name: " + clientName
                + "\nBalance: " + balance
                + "\nAddress: " + address;
    }
}
