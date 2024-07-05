public class dyanmic_method_dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A ref; // obtain a reference of type A

        ref = a; // ref refers to an A object
        ref.method();
        ref = b; // ref refers to an B object
        ref.method();

        A a1 = new C(); // dynamic method dispatch
        a1.method();
    }
}

class A {
    void method() {
        System.out.println("Inside A");
    }
}

class B extends A {
    void method() {
        System.out.println("Inside B");
    }
}

class C extends A { 
    void method() {
        System.out.println("Inside C");
    }
}