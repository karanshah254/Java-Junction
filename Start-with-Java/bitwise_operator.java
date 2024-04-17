import java.util.*;

public class bitwise_operator {
    public static void main(String[] args) {
        byte value1 = 12; // 0000 1100
        byte value2 = 10; // 0000 1010
        byte result;

        result = (byte) ~value1; // bitwise compliment
        System.out.println("Result is " + result);

        result = (byte) (value1 & value2); // bitwise AND operator
        System.out.println("Result is " + result);

        result = (byte) (value1 | value2); // bitwise OR operator
        System.out.println("Result is " + result);

        result = (byte) (value1 ^ value2); // bitwise XOR operator
        System.out.println("Result is " + result);

        result = (byte) (value1 << 2); // shifts 2 bit to left
        System.out.println("Result is " + result);

        result = (byte) (value1 >> 2); // shifts 2 bit to right
        System.out.println("Result is " + result);
    }
}