//Course OOP - PPU - Dr. Mohammed Jabari
//BY:A7mad_Joba 
package com.mycompany.bankaccount;

public class Main {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount(12345, "Ahmad Joba", 1000.0, "Hebron, Ps");

        System.out.println("" + myAccount.getInfo());
        
        System.out.println("Initial Balance: " + myAccount.getBalance());

        myAccount.deposit(500.0);
        System.out.println("Balance after deposit: " + myAccount.getBalance());

        myAccount.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + myAccount.getBalance());

        myAccount.setAccountNo(54321);
        System.out.println("Updated Account Number: " + myAccount.getAccountNo());
        
    }
}
