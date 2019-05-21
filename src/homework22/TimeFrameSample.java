package homework22;

import java.sql.Time;

public class TimeFrameSample {
    public static void main(String[] args) {
        TimeFrame timeFrame = new TimeFrame(13, 25, 40);
        System.out.println(timeFrame);

        TimeFrame timeFrame2 = new TimeFrame(3661);
        System.out.println(timeFrame2);

        //System.out.println(Integer.valueOf(50).compareTo(51));
        System.out.println(timeFrame.compareTo(timeFrame));
        System.out.println(timeFrame.compareTo(timeFrame2));

    }
}
