package homework3_2;

public class KeyBoardNumberToConsole {
    public static void main(String[] args) {
        int num = Integer.parseInt(System.console().readLine());
        //int num = new Scanner(System.in).nextInt();
        if (num % 10 == 7) {
            System.out.println("This number ends with 7");
        } else  {
            System.out.println("This number does NOT end with 7");
        }
    }
}
