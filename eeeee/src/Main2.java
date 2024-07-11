public class Main2 {
    public static void main(String[] args) {
HadoniChecking(824);
    }

    public static void HadoniChecking(int number) {
        int temp = number;
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        if (sum % 2 == 0 && temp % 2 == 0) {
            System.out.println("Hadoni number!");
        } else if (sum % 2 != 0 && temp % 2 != 0) {
            System.out.println("Hadoni number");
        } else {
            System.out.println("Not Hadoni number");
        }

    }
}
