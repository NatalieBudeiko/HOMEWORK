package homework5_2;

import java.util.Scanner;

public class TotalSum {
    public static void main(String[] args) {
        System.out.println("Please enter your number");
        long num = new Scanner(System.in).nextLong();
        long sum = 0;

        while (num > 0) {
            long lastNum = num % 10;
            sum = sum + lastNum;
            num = num / 10;
        }

        System.out.println("the sum is " + sum);//10
    }
}
