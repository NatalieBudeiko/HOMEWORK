package homework3_3;

import java.util.Scanner;

public class Rectangular {

    public static void main(String[] args) {

        double sideA = getDoubleFromKeyboard();
        double sideB = getDoubleFromKeyboard();
        double radius = getDoubleFromKeyboard();
        double hypothenuse = Math.sqrt(sideA * sideA + sideB * sideB);

        if (hypothenuse > 2 * radius) {
            System.out.println("This circle is too small to cover the rectangular");
        } else {
            System.out.println("This circle is big enough to cover the rectangular");
        }
    }

    private static double getDoubleFromKeyboard() {
        return Double.parseDouble(System.console().readLine());
        //return new Scanner(System.in).nextDouble();
    }

}
