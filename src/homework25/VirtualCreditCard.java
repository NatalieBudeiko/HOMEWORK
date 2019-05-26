package homework25;

import java.time.LocalDate;

public class VirtualCreditCard extends CreditCard implements Virtual{


    public VirtualCreditCard(int balance, LocalDate expirationDate, String cardHolderName, String cardNumber) {
        super(balance, expirationDate, cardHolderName, cardNumber);
    }
}
