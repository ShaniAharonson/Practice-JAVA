package RandomCls;

public class RandomFactory {

    public static int generateAge(int min, int max) {
        return min + (int)(Math.random() * (max - min + 1));
    }

    public static double generateSalaryAmount(double min, double max) {
        return min + (Math.random() * (max - min));
    }

    public static int generateYearlyBonus(int min, int max) {
        return min + (int)(Math.random() * (max - min + 1));
    }

    public static String generateEmployeeName(int index) {
        return "Employee" + index;
    }

    public static String generateManagerName(int index) {
        return "Manager" + index;
    }
}
