package homework3_1;

public class DaysAndWeeks {
    public static void main(String[] args) {

        int totalSeconds = 694861;
        int seconds = totalSeconds % 60;
        int totalMinutes = (totalSeconds - seconds) / 60;
        int minutes = totalMinutes % 60;
        int totalHours = (totalMinutes - minutes) / 60;
        int hours = totalHours % 24;
        int totalDays = (totalHours - hours) / 24;
        int days = totalDays % 7;
        int totalWeeks = (totalDays - days) / 7;

        System.out.println(totalWeeks + " недель " + days + " дней " + hours + " часов " + minutes + " минут " + seconds + " секунд");

    }
}
