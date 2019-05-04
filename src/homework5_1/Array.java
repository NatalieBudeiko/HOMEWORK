package homework5_1;

import java.util.Arrays;

public class Array {


    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println(Arrays.toString(numbers));
        int maxNum = numbers[0];
        //for //your code here
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
        }
        System.out.println("The max number in the array is " + maxNum);

        int minNum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNum) {
                minNum = numbers[i];
            }
        }
        System.out.println("The min number in the array is " + minNum);
    }
}







