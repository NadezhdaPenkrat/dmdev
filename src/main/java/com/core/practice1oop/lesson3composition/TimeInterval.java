package src.main.java.com.core.practice1oop.lesson3composition;

public class TimeInterval {

    private int seconds;
    private int minutes;
    private int hours;

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public TimeInterval(int sumInterval) {
        this.hours = sumInterval / 3600;
        this.minutes = sumInterval % 3600 / 60;
        this.seconds = sumInterval % 3600 % 60;
    }

    public int sumInterval() {
        return this.seconds + this.minutes * 60 + this.hours * 60 * 60;
    }

    public void print() {
        System.out.println("seconds=" + seconds + ", minutes=" + minutes + ", hours=" + hours);
    }
}
