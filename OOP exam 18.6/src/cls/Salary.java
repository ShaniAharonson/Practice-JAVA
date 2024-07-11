package cls;

public class Salary {
    private double amount;
    private int yearlyBonus;

    public Salary(double amount, int yearlyBonus) {
        setAmount(amount);
        setYearlyBonus(yearlyBonus);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount < 1000 || amount > 50000) {
            throw new IllegalArgumentException("Invalid amount" + amount);
        }
        this.amount = amount;
    }

    public int getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(int yearlyBonus) {
        if (yearlyBonus < 0 || yearlyBonus > 10000) {
            throw new IllegalArgumentException("Yearly bonus must be between 0-10000");
        }
        this.yearlyBonus = yearlyBonus;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "amount=" + amount +
                ", yearlyBonus=" + yearlyBonus +
                '}';
    }
}
