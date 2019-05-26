package homework25;

import java.time.LocalDate;

public class PlasticDebitCard extends DebitCard implements Plastic{
    public PlasticDebitCard(int balance, LocalDate expirationDate, String cardHolderName, String cardNumber) {
        super(balance, expirationDate, cardHolderName, cardNumber);
    }
}
