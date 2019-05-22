package homeworkLambda;

import java.util.function.IntBinaryOperator;

public class Lambda {
    public static void main(String[] args) {
        int numberA = (int) (Math.random() * 100);
        int numberB = (int) (Math.random() * 100);

        System.out.println("Your numbers are " + numberA + " " + numberB);

        IntBinaryOperator maxLambda = (int a, int b) -> a > b ? a : b;
        int result = maxLambda.applyAsInt(numberA, numberB);
        System.out.println("Your max number is " + result);

        IntBinaryOperator minLambda = (int a, int b) -> a < b ? a : b;
        int result1 = minLambda.applyAsInt(numberA, numberB);
        System.out.println("Your min number is " + result1);
    }
}
