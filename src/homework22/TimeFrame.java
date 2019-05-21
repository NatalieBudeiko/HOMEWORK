package homework22;

public class TimeFrame implements Comparable {
    private long hours;
    private long minutes;
    private long seconds;

    public TimeFrame(long totalSeconds) {
        this.seconds = totalSeconds % 60;
        long totalMinutes = (totalSeconds - seconds) / 60;
        this.minutes = totalMinutes % 60;
        this.hours = (totalMinutes - minutes) / 60;
    }

    public TimeFrame(long hours, long minutes, long seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String toString() {
        return "TimeFrame{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        long totalSeconds = seconds + minutes * 60 + hours * 3600;
        TimeFrame anotherTimeFrame = (TimeFrame) o;
        long anotherTimeFrameTotalSeconds = anotherTimeFrame.seconds + anotherTimeFrame.minutes * 60 + anotherTimeFrame.hours * 3600;
        if (totalSeconds > anotherTimeFrameTotalSeconds) return 1;
        if (totalSeconds < anotherTimeFrameTotalSeconds) return -1;
        return 0;
    }
}
