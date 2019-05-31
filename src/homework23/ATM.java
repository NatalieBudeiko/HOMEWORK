package homework23;

import java.util.HashMap;
import java.util.Map;

public class ATM {
    Map<Integer, BankAccount> bankAccountMap = new HashMap<>();

    String checkBalance(int accountNumber) {
        BankAccount bankAccount = bankAccountMap.get(accountNumber);
        return bankAccount.accountHolder + ": " + bankAccount.balance + " " + bankAccount.currency;
    }

    void depositCash(int accountNumber, int amountToDeposit) {
        BankAccount bankAccount = bankAccountMap.get(accountNumber);
        bankAccount.deposit(amountToDeposit);

    }

    void getCash(int accountNumber, int amountToWithdraw) {
        BankAccount bankAccount = bankAccountMap.get(accountNumber);
        int balance = bankAccount.balance;
        if (balance < amountToWithdraw){
            System.out.println("Sorry, not enough funds in your account");
            return;
        }
        bankAccount.cashout(amountToWithdraw);
    }

    void addAccount(BankAccount bankAccount) {
        bankAccountMap.put(bankAccount.accountNumber, bankAccount);
    }
}
