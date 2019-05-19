package homework18;


import java.util.Scanner;

public class PunctuationMarks {
    public static void main(String[] args) {
        System.out.println("Please type in your phrase");
        String phrase = new Scanner(System.in).nextLine();
        int punctuationMarksCount = 0;
        char symbol;
        for (int i = 0; i < phrase.length(); i++) {
            symbol = phrase.charAt(i);
            if (isPunctuationMark(symbol)) {
                punctuationMarksCount++;
            }
        }
        System.out.println("The total number of punctuation marks in your phrase is " + punctuationMarksCount);
    }
    private static boolean isPunctuationMark(char symbol) {
        return symbol == ',' || symbol == '-' || symbol == ':' || symbol == ';' || symbol == '?' || symbol == '!' || symbol == '.';
    }
}
