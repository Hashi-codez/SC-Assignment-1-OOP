/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashir Azeem
 */
public class DigitalWallet {

    private String accountHolder;
    private double balance;
    private final String pinCode; // set once, never exposed

    public DigitalWallet(String accountHolder, double initialBalance, String pinCode) {
        this.accountHolder = accountHolder;
        this.balance = (initialBalance < 0) ? 0 : initialBalance; // never start negative
        this.pinCode = pinCode;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // No getPinCode() on purpose - pin should never be readable from outside.

    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit failed: amount must be positive.");
            return false;
        }
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
        return true;
    }

    public boolean withdraw(double amount, String enteredPin) {
        if (!pinCode.equals(enteredPin)) {
            System.out.println("Withdrawal failed: incorrect PIN.");
            return false;
        }
        if (amount <= 0) {
            System.out.println("Withdrawal failed: amount must be positive.");
            return false;
        }
        if (amount > balance) {
            System.out.println("Withdrawal failed: insufficient funds.");
            return false;
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
        return true;
    }
}
