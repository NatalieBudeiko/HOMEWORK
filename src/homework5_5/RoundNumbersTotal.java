package homework5_5;


import java.util.Arrays;

public class RoundNumbersTotal {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println(Arrays.toString(numbers));
        int maxNumIndex = 0;
        int maxNum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
                maxNumIndex = i;
            }
        }
        System.out.println("The max number in the array is " + maxNum + ". Its index is " + maxNumIndex);
        int minNumIndex = 0;
        int minNum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNum) {
                minNum = numbers[i];
                minNumIndex = i;
            }
        }
        System.out.println("The min number in the array is " + minNum + ". Its index is " + minNumIndex);

        int sum = 0;
        for (int i = Math.min(minNumIndex, maxNumIndex); i <= Math.max(maxNumIndex, minNumIndex); i++) {
            sum = sum + numbers[i];
        }
        System.out.println("The sum of numbers in the array between the max and min is " + sum);

    }

}
