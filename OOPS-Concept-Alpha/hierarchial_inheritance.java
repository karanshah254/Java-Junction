public class hierarchial_inheritance {
    public static void main(String[] args) {
        Mammal m1 = new Mammal();
        m1.eat();
        m1.walk();
        Fish f1 = new Fish();
        f1.sleep();
        f1.swim();
    }
}

class Animal_2 {
    void eat() {
        System.out.println("eats");
    }

    void sleep() {
        System.out.println("sleeps");
    }
}

class Mammal extends Animal_2 {
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animal_2 {
    void swim() {
        System.out.println("swims");
    }
}