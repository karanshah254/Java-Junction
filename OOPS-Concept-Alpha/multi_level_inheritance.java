// this is multi level inheritance

public class multi_level_inheritance {
    public static void main(String[] args) {
        Human human = new Human();
        human.eat(); // parent class
        human.smell(); // 1st derived class
        human.talk(); // 2nd derived class
        human.legs = 2;
        System.out.println("Humans have " + human.legs + " legs");
    }
}

class Animal_1 {
    String color;

    void eat() {
        System.out.println("Animal eats");
    }

    void sleep() {
        System.out.println("Animal sleeps");
    }
}

class Mammal extends Animal_1 {
    int legs;

    void smell() {
        System.out.println("Mammal can smell");
    }
}

class Human extends Mammal {
    void talk() {
        System.out.println("Humans can talk");
    }
}