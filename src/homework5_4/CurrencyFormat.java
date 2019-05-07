package homework5_4;

import java.util.Scanner;

public class CurrencyFormat {
    public static void main(String[] args) {
        System.out.println("Please enter your amount");
        String num = new Scanner(System.in).nextLine();
        String result = "";
        for (int i = 0; i < num.length(); i++) {
            if (i % 3 == 0) {
                result = " " + result;
            }
            result = num.charAt(num.length() - 1 - i) + result;

        }
        System.out.println(result); //3000

    }
}

