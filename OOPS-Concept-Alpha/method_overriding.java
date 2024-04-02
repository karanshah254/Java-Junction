public class method_overriding {
    public static void main(String[] args) {
        B b = new B();
        b.eat();
    }
}

// method overriding: parent and child classes both contain the same function
// with a diff defination
class A {
    void eat() {
        System.out.println("eats anything");
    }
}

class B extends A {
    void eat() {
        System.out.println("eats fruits only");
    }
}
