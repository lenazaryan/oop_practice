/*
Create a BankAccount class with properties accountNumber, balance, and owner.
The class should have a constructor that initializes these properties and
methods deposit(double amount), withdraw(double amount), and displayBalance().
 */

import java.util.Random;

public class BankAccount {
    String owner;
    int accountNumber;
    double balance;

    public BankAccount (String owner){
        this.owner = owner;
        this.accountNumber = (int)(Math.random()*1000000);
        this.balance = 0;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit request created.\nDeposit amount: " + amount);
    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdrawal request created.\nWithdrawal amount: " + amount);
    }

    public void displayBalance(){
        System.out.println("Current Balance: " + balance);
    }
}
