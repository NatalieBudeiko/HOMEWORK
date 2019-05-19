package homework17;

import java.util.Arrays;

public class Butterfly {
    public static void main(String[] args) {
        int butterfly[][] = new int[10][10];

        for (int i = 0; i < butterfly.length; i++) {
            int[] array = butterfly[i];
            for (int j = 0; j < array.length; j++) {
                int start = Math.min(i, array.length - 1 - i);
                int end = Math.max(i, array.length - 1 - i);
                if (j <= end && j >= start) {
                    array[j] = 5;
                }
            }
        }
        for (int i = 0; i < butterfly.length; i++) {
            int[] array = butterfly[i];
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }

    }
}
