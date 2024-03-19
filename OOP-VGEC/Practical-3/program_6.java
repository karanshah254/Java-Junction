import java.util.Scanner;

class Account {
    private int accNumber;
    private int balance;
    private String name;

    Account(int accNumber, int balance, String name) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.name = name;
    }

    void setData(int accNumber, int balance, String name) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.name = name;
    }

    void putData() {
        System.out.println("Account Number is " + this.accNumber + "\nBalance is " + this.balance
                + "\nName of holder is " + this.name);
    }

    int getID() {
        return this.accNumber;
    }
}

public class program_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account a[] = new Account[5];
        a[0] = new Account(101, 20000000, "Cesar");
        a[1] = new Account(102, 999999999, "Carl Johnson");
        a[2] = new Account(103, 56000, "Officer Tempenny");
        a[3] = new Account(104, 43000, "Eddie Pulaski");
        a[4] = new Account(105, 3400000, "Officer Herandez");

        System.out.print("Enter account number : ");
        int acc_no = sc.nextInt();
        boolean user = false;

        for (int i = 0; i < 5; i++) {
            if (a[i].getID() == acc_no) {
                a[i].putData();
                user = true;
            }
        }

        if (!user) {
            System.out.println("USer not found");
        }
        sc.close();
    }
}