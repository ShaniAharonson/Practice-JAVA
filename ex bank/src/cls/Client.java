package cls;

public abstract class Client extends Person{

    private Float interestRate;
    private Account account;

    public Client(Float interestRate, Account account) {
        super();
        this.interestRate = interestRate;
        this.account = account;
    }

    public Float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Float interestRate) {
        this.interestRate = interestRate;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Client{" +
                "interestRate=" + interestRate +
                ", account=" + account +
                '}';
    }

}
