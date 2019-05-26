package homework25;

import java.time.LocalDate;

public abstract class PaymentCard {
    protected final int balance;
    protected final LocalDate expirationDate;
    protected final String cardHolderName;
    protected final String cardNumber;

    public PaymentCard(int balance, LocalDate expirationDate, String cardHolderName, String cardNumber) {
        this.balance = balance;
        this.expirationDate = expirationDate;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "PaymentCard{" +
                "balance=" + balance +
                ", expirationDate=" + expirationDate +
                ", cardHolderName='" + cardHolderName + '\'' +
                '}';
    }
}
