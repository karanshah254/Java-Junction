
public class get_set {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("red");
        System.out.println(p1.getColor()); // red
        p1.setTip(10);
        System.out.println(p1.getTip());

    }
}

class Pen {
    private String color;
    private int tip;

    // getters
    String getColor() {
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
    // this keyword is used to refer to current object

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}