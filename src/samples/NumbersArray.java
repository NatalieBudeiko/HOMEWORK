package samples;

import java.util.Arrays;

public class NumbersArray {

    public static void main(String[] args) {

        // 2,4,6,8,10,12,14,16,18,20 for / while 
        System.out.println("For loop: ");
        System.out.println(Arrays.toString(doFor()));
        System.out.println("\n");

        System.out.println("While loop: ");
        System.out.println(Arrays.toString(doWhile()));
        System.out.println("\n");

        // (1,0,1,0,1,0,1,0,1)
        System.out.println("And now the damn magic :) Prepare your eyes for 0s and 1s: ");

        final int size = 5;
        print(fillOut(size), size);
    }

    private static int[][] fillOut(final int size) {
        final int[][] numbers = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        numbers[i][j] = 1;
                    } else {
                        numbers[i][j] = 0;
                    }
                } else {
                    if (j % 2 == 0) {
                        numbers[i][j] = 0;
                    } else {
                        numbers[i][j] = 1;
                    }
                }
            }
        }

        return numbers;
    }

    private static void print (final int[][] arr, final int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    private static int[] doFor() {
        final int[] numbers = new int[10];

        int idx = 0;
        int step = 2;
        for (int i = 2; i <= 20; i = i + step) {
            numbers[idx++] = i;
        }

        return numbers;
    }

    private static int[] doWhile() {
        final int[] numbers = new int[10];

        int i = 2;
        int idx = 0;
        while (i <= 20) {
            numbers[idx++] = i;
            i = i + 2;
        }

        return numbers;
    }
}

