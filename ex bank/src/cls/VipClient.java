package cls;

public class VipClient extends Client{
    public static final float interestRate = 1.1f;
    public VipClient(){
        super(interestRate,new Account());
    }

    @Override
    public String toString() {
        return "VipClient: " + super.toString();
    }
}
