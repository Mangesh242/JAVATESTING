package org.example;

public class BankAccount {
    int balance = 0;
    int minBalance = 0;

    public BankAccount(int balance, int minBalance) {
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public void deposit(int amount) {
        this.balance+=amount;
    }

    public int getBalance() {
        return this.balance;
    }
}
