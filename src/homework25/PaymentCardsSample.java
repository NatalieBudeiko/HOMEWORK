package homework25;

import java.time.LocalDate;

public class PaymentCardsSample {
    public static void main(String[] args) {
        PlasticCreditCard card = new PlasticCreditCard(1234, LocalDate.now(), "NATALIA BUDEIKO", "0000-1111-2222-3333");
        System.out.println(card);
    }
}
