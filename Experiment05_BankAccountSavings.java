class BankAccount {
    protected double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Balance = " + balance);
    }
}

class SavingsAccount extends BankAccount {
    @Override
    void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal denied.");
            System.out.println("Balance cannot fall below 100.");
        }
    }
}

public class Experiment05_BankAccountSavings {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();

        account.deposit(500);
        account.displayBalance();

        account.withdraw(300);
        account.displayBalance();

        account.withdraw(150);
        account.displayBalance();
    }
}