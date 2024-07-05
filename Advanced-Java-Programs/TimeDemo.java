class Time {
    int hour;
    int minute;
    int seconds;

    public Time(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.seconds = s;
    }

    void add(Time t) {
        this.seconds += t.seconds;
        if (this.seconds >= 60) {
            this.minute++;
            this.seconds -= 60;
        }

        this.minute += t.minute;
        if (this.minute >= 60) {
            this.hour++;
            this.minute -= 60;
        }

        this.hour += t.hour;
    }
}

public class TimeDemo {
    public static void main(String[] args) {
        Time t1 = new Time(11, 59, 55);
        Time t2 = new Time(0, 0, 5);

        t1.add(t2);
        System.out.println(t1.hour + ":" + t1.minute + ":" + t1.seconds);
    }
}