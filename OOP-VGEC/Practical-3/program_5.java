class Time {
    private int hours;
    private int minutes;

    void setTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    void displayTime() {
        System.out.println("Time : " + hours + " hours  " + minutes + " minutes");
    }

    void sum(Time t1, Time t2) {
        this.hours = t1.hours + t2.hours;
        this.minutes = t1.minutes + t2.minutes;

        if (this.minutes >= 60) {
            this.hours += this.minutes / 60;
            this.minutes = this.minutes % 60;
        }
    }
}

public class program_5 {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();

        t1.setTime(3, 45);
        t2.setTime(4, 30);
        System.out.println("Initial time is : ");
        t1.displayTime();
        t2.displayTime();

        t3.sum(t1, t2);
        System.out.println("\n->Sum of time : ");
        t3.displayTime();
    }
}