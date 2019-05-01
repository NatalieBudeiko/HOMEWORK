package homework4_2;

import java.util.Scanner;

//when creating this program I assumed that there should be space between the houses
//and the borders of the lot therefore I used absolute equality
public class Houses {
    public static void main(String[] args) {
        System.out.println("Please enter side A");
        int sideA = new Scanner(System.in).nextInt();
        System.out.println("Please enter side C");
        int sideC = new Scanner(System.in).nextInt();
        System.out.println("Please enter side B");
        int sideB = new Scanner(System.in).nextInt();
        System.out.println("Please enter side D");
        int sideD = new Scanner(System.in).nextInt();
        System.out.println("Please enter side E");
        int sideE = new Scanner(System.in).nextInt();
        System.out.println("Please enter side F");
        int sideF = new Scanner(System.in).nextInt();


        if ((sideA + sideC < sideE) && (sideB + sideD < sideF)) {
            System.out.println("These houses can fit this lot");
        } else if ((sideA + sideC < sideF) && (sideB + sideD < sideE)) {
            System.out.println("These houses can fit this lot");
        } else if ((sideB + sideC < sideE) && (sideA + sideD < sideF)) {
            System.out.println("These houses can fit this lot");
        } else if ((sideB + sideC < sideF) && (sideA + sideD < sideE)) {
            System.out.println("These houses can fit this lot");
        } else System.out.println("These houses are too big for this lot");
    }
}


