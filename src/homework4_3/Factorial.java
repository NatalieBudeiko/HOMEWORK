package homework4_3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        long n = new Scanner(System.in).nextInt();

        long result = 1;
        long multiplier = 2;
        while (n > 1 && multiplier <= n) {
            result = result * multiplier;
            multiplier++;
        }
        System.out.println("Your factorial is " + result);
    }

}
