package cls;

public class VipClient extends Client implements Comparable<Client>{
    public static final float interestRate = 1.10f;
    public VipClient() {
        super(interestRate,new Account());
    }

    @Override
    public String toString() {
        return super.toString()+ "VipClient{}";
    }

    @Override
    public int compareTo(Client o) {
        return (int) (this.getAccount().getBalance()-o.getAccount().getBalance());
    }
}
