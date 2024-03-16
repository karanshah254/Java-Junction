public class basic_concept {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // pen object
        p1.setColor("Red");
        System.out.println(p1.color);
        p1.setTip(10);
        System.out.println(p1.tip);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}