public class abstraction_program {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        // Animal -> Horse -> Cat => inheritance hierachy

        Cat c1 = new Cat();
        c1.eat();
        c1.walk();
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "brown";
    }

    void eat() {
        System.out.println("Animal eats");
    }

    // this walk function is different for diff animals, hence it's declared as an
    // abstract method
    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        color = "black";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Cat extends Animal {
    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("cat walks on its two legs");
    }
}