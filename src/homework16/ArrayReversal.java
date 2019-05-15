package homework16;

import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("The original array is " + Arrays.toString(numbers));


        int[] reversedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int index = numbers.length - i -1;
            reversedNumbers[i] = numbers[index];
        }
        System.out.println("The reversed array is " + Arrays.toString(reversedNumbers));
    }

}
