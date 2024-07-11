package cls;

public class RegularClient extends Client {
    public static final float interestRate = 1.05f;

    public RegularClient() {
        super(interestRate, new Account());
    }

    @Override
    public String toString() {
        return "RegularClient: " + super.toString();
    }
}
