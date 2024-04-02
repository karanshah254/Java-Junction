public class inheritance_code {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // use of inheritance
        dog.bark(); // use of same method in child class
    }
}

// parent class
class Animal {
    String color;

    void eat() {
        System.out.println("Animal can eat");
    }

    void breath() {
        System.out.println("Animal can breathe");
    }
}

// child class
class Dog extends Animal {

    void swim() {
        System.out.println("Fish can swim");
    }

    void bark() {
        System.out.println("Dogs bark on strangers");
    }
}
// this is single level inheritance