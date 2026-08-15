import java.util.*;

class BankAccount {
    private double balance;

    BankAccount() {
        balance = 0;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    double getBalance() {
        return balance;
    }
}

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        BankAccount account = new BankAccount();

        for (int i = 0; i < n; i++) {
            String operation = sc.next();
            double amount = sc.nextDouble();

            try {
                if (operation.equals("Deposit")) {
                    account.deposit(amount);
                } else if (operation.equals("Withdraw")) {
                    account.withdraw(amount);
                } else {
                    throw new IllegalArgumentException("Invalid operation");
                }
            } catch (Exception e) {
                System.out.println("Invalid transaction");
            }
        }

        System.out.println((int) account.getBalance());

        sc.close();
    }
}
