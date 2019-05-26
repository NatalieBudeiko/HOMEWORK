package samples;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number");
        final double firstNumber = scanner.nextDouble();

        System.out.println("Enter your second number");
        final double secondNumber = scanner.nextDouble();

        System.out.println("Enter your operation");
        final char o = scanner.next().charAt(0);

        if (o == '+') {
            System.out.println("Your result is " + (firstNumber + secondNumber));
        } else if (o == '-') {
            System.out.println("Your result is " + (firstNumber - secondNumber));
        } else if (o == '/') {
            System.out.println("Your result is " + (firstNumber / secondNumber));
        } else if (o == '*') {
            System.out.println("Your result is " + (firstNumber * secondNumber));
        }
    }
}
