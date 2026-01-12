import java.util.ArrayList;
import java.util.List;

public class Account {
    private String username;
    private String password;

    private List<Transaction> transactions = new ArrayList<>();

    private String ownerName;
    private double balance;

    public Account(String ownerName, String username, String password) {
        this.ownerName = ownerName;
        this.username = username;
        this.password = password;
        this.balance = 0.0;
    }

    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }


    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("DEPOSIT", amount));
        }
    }


    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("WITHDRAW", amount));
            return true;
        }
        return false;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

}

