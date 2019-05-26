package homework25;

import java.time.LocalDate;

public class PlasticCreditCard extends CreditCard implements Plastic{


    public PlasticCreditCard(int balance, LocalDate expirationDate, String cardHolderName, String cardNumber) {
        super(balance, expirationDate, cardHolderName,  cardNumber);
    }
}
