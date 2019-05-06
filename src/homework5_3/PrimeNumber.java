package homework5_3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Please enter your number");
        int num = new Scanner(System.in).nextInt();


        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("This is a compound number");
                return;
            }
        }

        System.out.println("This is a prime number");


    }
}



