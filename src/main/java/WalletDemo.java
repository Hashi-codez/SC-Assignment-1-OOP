/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashir Azeem
 */
public class WalletDemo {
    public static void main(String[] args) {

        DigitalWallet wallet = new DigitalWallet("Hashir Azeem", 5000.0, "4321");

        System.out.println("--- Wrong PIN attempt ---");
        wallet.withdraw(1000, "0000");

        System.out.println("\n--- Correct PIN, valid amount ---");
        wallet.withdraw(1500, "4321");

        System.out.println("\n--- Withdraw more than balance ---");
        wallet.withdraw(10000, "4321");

        System.out.println("\n--- Deposit ---");
        wallet.deposit(2000);

        System.out.println("\nFinal balance for " + wallet.getAccountHolder() + ": " + wallet.getBalance());
    }
}