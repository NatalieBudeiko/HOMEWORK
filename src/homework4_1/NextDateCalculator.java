package homework4_1;

import java.util.Scanner;

public class NextDateCalculator {
    public static void main(String[] args) {
        System.out.println("Please enter day");
        int day = new Scanner(System.in).nextInt();
        System.out.println("Please enter month");
        int month = new Scanner(System.in).nextInt();
        System.out.println("Please enter year");
        int year = new Scanner(System.in).nextInt();
        
        int nextDay = getNextDay(day, month, year);
        int nextMonth = getNextMonth(nextDay, month);
        int nextYear = getNextYear(day, month, year);

        System.out.println(nextDay + " " + nextMonth + " " + nextYear);
    }

    private static int getNextYear(int day, int month, int year) {
        if (day == 31 && month == 12) {
            return year + 1;
        } else {
            return year;
        }
    }

    private static int getNextMonth(int nextDay, int month) {
        if (nextDay == 1) {
            if (month == 12) {
                return 1;
            }
            return month + 1;
        } else {
            return month;
        }
    }

    private static int getNextDay(int day, int month, int year) {
        boolean isLeapYear = year % 4 == 0;
        if (day == 31) {
            return 1;
        }
        if ((day == 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
            return 1;
        }

        if ((month == 2) && day == 29) {
            return 1;
        }

        if ((month == 2) && day == 28) {
            if (!isLeapYear) {
                return 1;
            }
        }
        return day + 1;
    }


}



