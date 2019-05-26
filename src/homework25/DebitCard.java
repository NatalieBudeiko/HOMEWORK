package homework25;

import java.time.LocalDate;

public class DebitCard extends PaymentCard{

    public DebitCard(int balance, LocalDate expirationDate, String cardHolderName, String cardNumber) {
        super(balance, expirationDate, cardHolderName, cardNumber);
    }
}
