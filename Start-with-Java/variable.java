/*
Data types in Java
1. int: integer 
2. float: decimal number
3. double: decimal number with more precision than float
4. string: any name of thing, person, etc
5. char: character like @, $, &, etc
6. boolean: true(1) or false(0)
7. array: user defined 
8. class: user defined 
9. interface: user defined 
10. object: user defined 
 */
// input output in java

import java.util.Scanner;

public class variable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println(name);
        int number = in.nextInt();
        System.out.println(number);
        float floatingNumber = in.nextFloat();
        System.err.println(floatingNumber);
        in.close(); // to close scanner
    }
}
