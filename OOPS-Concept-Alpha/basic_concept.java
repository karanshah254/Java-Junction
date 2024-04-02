public class basic_concept {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // pen object
        p1.setColor("Red");
        System.out.println(p1.color);
        p1.setTip(10);
        System.out.println(p1.tip);

        BankAccount acc = new BankAccount();
        acc.username = "Karan Shah";
        // acc.password = "karan&25"; "private keyword can't be accessed directly"
        acc.setPasswd("karan&25"); // can change password but cannot access it directly
    }
}

class BankAccount {
    public String username;
    // private String password;

    public void setPasswd(String pwd) {
        // password = pwd;
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