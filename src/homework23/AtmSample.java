package homework23;

public class AtmSample {
    private static final int IVAN_ACCOUNT_NUMBER = 1234;

    public static void main(String[] args) {
        ATM atm = new ATM();
        BankAccount ivan = new BankAccount(IVAN_ACCOUNT_NUMBER, "Ivan", 1234, -970000, Currency.USD);
        atm.addAccount(ivan);
        System.out.println(atm.checkBalance(IVAN_ACCOUNT_NUMBER));
        atm.getCash(IVAN_ACCOUNT_NUMBER, 123);
        atm.depositCash(IVAN_ACCOUNT_NUMBER, 600);
    }
}