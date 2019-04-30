package homework3_4;

import homework4_1.NextDateCalculator;

import java.util.Scanner;

public class Rubles {
    public static void main(String[] args) {

        int roubles = getIntFromKeyboard();

        int remainder = roubles % 10;
        if (remainder == 1) {
            System.out.println(roubles + " рубль");
        } else if (remainder == 2 || remainder == 3 || remainder == 4) {
            System.out.println(roubles + " рубля");
        } else {
            System.out.println(roubles + " рублей");
        }

    }

    private static int getIntFromKeyboard() {
        return Integer.parseInt(System.console().readLine());
        //return new Scanner(System.in).nextInt();
    }
}
