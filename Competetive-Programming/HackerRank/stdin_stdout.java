import java.util.Scanner;

public class stdin_stdout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int value = sc.nextInt();

        System.out.println("String is " + str + " and integer is " + value);
    }
}
