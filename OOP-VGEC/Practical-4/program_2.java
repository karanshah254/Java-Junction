class BankAccount {
    double balance;
    String accountNumber;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited amount is " + amount);
    }

    public void withDraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawen amount is " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void checkBalance() {
        System.out.println("Account balance is " + balance);
    }
}

class SavingAccount extends BankAccount {
    double interestRate;

    public SavingAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void findInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added is " + interest);
    }
}

class FixedDepositAccount extends BankAccount {
    public FixedDepositAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
}

public class program_2 {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("SA001", 50000, 12);
        System.out.println("For saving account");
        savingAccount.checkBalance();
        savingAccount.deposit(10000);
        savingAccount.withDraw(5000);
        savingAccount.findInterest();
        savingAccount.checkBalance();

        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD001", 200000);
        System.out.println("\nFor fixed deposit account");
        fixedDeposit.checkBalance();
        fixedDeposit.deposit(50000);
        fixedDeposit.checkBalance();
        fixedDeposit.withDraw(100000);
        fixedDeposit.checkBalance();
    }
}