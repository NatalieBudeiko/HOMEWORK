package homework23;

public class BankAccount {
    final int accountNumber;
    final String accountHolder;
    final int pinCode;
    int balance;
    final Currency currency;

    public BankAccount(int accountNumber, String accountHolder, int pinCode, int balance, Currency currency) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.pinCode = pinCode;
        this.balance = balance;
        this.currency = currency;
    }

    public void cashout(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        System.out.println("You withdrew " + amountToWithdraw + "." + "Your current balance now is " + balance + " " + currency);
    }

    public void deposit(int amountToDeposit) {
        balance = balance + amountToDeposit;
        System.out.println("You deposited " + amountToDeposit + "." + "Your current balance now is " + balance + " " + currency);
    }
}
