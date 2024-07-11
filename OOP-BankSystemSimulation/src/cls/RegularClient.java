package cls;

public class RegularClient extends Client implements Comparable<Client>{
    public static final float interestRate = 1.05f;
    public RegularClient() {
        super(interestRate, new Account());
    }

    @Override
    public String toString() {
        return super.toString() +"RegularClient{}";
    }

    @Override
    public int compareTo(Client o) {
        return (int) (this.getAccount().getBalance()-o.getAccount().getBalance());
    }
}
