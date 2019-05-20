package homework19;


import java.util.Scanner;

public class NumberOfWords {
    public static void main(String[] args) {
        System.out.println("Please type in your text");
        String text = new Scanner(System.in).nextLine().trim().replaceAll("[^A-Za-zа-яА-Я0-9]", " ");;
        int wordCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (i == 0 && text.charAt(i) != ' ') {
                wordCount++;
            }
            if (i != 0 && text.charAt(i) != ' ' && text.charAt(i - 1) == ' ') {
                wordCount++;
            }

        }
        System.out.println("Total number of words in your text is " + wordCount);
    }

}
