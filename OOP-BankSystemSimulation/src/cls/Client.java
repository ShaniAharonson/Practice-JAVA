package cls;

import java.util.Objects;

public abstract class Client extends Person{
    private Float interestRate;
    private Account account;
    private static int counter = 1;

    public Client(float interestRate, Account account) {
        super();
        this.id = counter;
        this.name = "Client " + counter++;
        this.interestRate = interestRate;
        this.account = account;
    }

    public Float getInterestRate() {
        return interestRate;
    }


    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return super.toString()+ "Client{" +
                "interestRate=" + interestRate +
                ", account=" + account +
                '}';
    }
}

