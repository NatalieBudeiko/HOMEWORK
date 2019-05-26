package homework25;

import java.time.LocalDate;

public class CreditCard extends PaymentCard{
    protected boolean hasDebt;

    public CreditCard(int balance, LocalDate expirationDate, String cardHolderName, String cardNumber) {
        super(balance, expirationDate, cardHolderName, cardNumber);
    }
}
