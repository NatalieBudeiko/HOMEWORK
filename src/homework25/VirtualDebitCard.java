package homework25;

import java.time.LocalDate;

public class VirtualDebitCard extends DebitCard implements Virtual{
    public VirtualDebitCard(int balance, LocalDate expirationDate, String cardHolderName, String cardNumber) {
        super(balance, expirationDate, cardHolderName, cardNumber);
    }
}
