package designpatterns.singleton;

public class BankingAccountSingleton {
    private static BankingAccountSingleton instance = null;

    private double balance;

    private BankingAccountSingleton() {
    }

    public static BankingAccountSingleton getInstance() {
        if (instance == null) {
            instance = new BankingAccountSingleton();
        }
        return instance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
