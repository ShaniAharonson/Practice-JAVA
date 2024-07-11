package cls;

public class Account {
    public Account(Double balance) {
        this.balance = balance;
    }

    private Double balance;

    public Account() {
        this.balance = (Math.random() * 8001) - 4000;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
