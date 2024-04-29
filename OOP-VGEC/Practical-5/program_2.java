interface I1 {
}

interface I2 {

}

interface I3 extends I1, I2 {

}

interface I4 {

}

class X implements I3 {

}

class W extends X implements I4 {

}

public class program_2 {
    public static void main(String[] args) {
        W w = new W();

        System.out.println("Does object implements I1 ? " + (w instanceof I1));
        System.out.println("Does object implements I2 ? " + (w instanceof I2));
        System.out.println("Does object implements I3 ? " + (w instanceof I3));
        System.out.println("Does object implements I4 ? " + (w instanceof I4));

        System.out.println("Is object of type X ? " + (w instanceof X));
    }
}