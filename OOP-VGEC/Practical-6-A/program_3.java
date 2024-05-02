class InsufficientFundException extends Exception {
    public InsufficientFundException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Desposited: Rs " + amount);
        System.out.println("Current balance is Rs " + balance);
    }

    public void withdraw(double amount) throws InsufficientFundException {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawen: Rs " + amount);
            System.out.println("Current balance is Rs " + balance);
        } else {
            throw new InsufficientFundException("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class program_3 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(0.00);
        myAccount.deposit(1000.00);

        try {
            myAccount.withdraw(400.00);
        } catch (InsufficientFundException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }

        try {
            myAccount.withdraw(300.00);
        } catch (InsufficientFundException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }

        try {
            myAccount.withdraw(500.00);
        } catch (InsufficientFundException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }
        
        System.out.println("Remaining balance is Rs " + myAccount.getBalance());
    }
}