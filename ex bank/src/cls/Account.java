package cls;

import Utils.BalanceUtil;

public class Account {
    private Double balance;

    public Account() {
       setBalance(BalanceUtil.createBalance());
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdrawMoney(double amount){
        setBalance(this.balance-amount);
    }

    public void depositMoney(double amount) {
        setBalance(this.balance+amount);
    }
}
