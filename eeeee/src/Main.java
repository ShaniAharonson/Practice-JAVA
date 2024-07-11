public class Main {
    public static void main(String[] args) {
     checkNum("12345678");
    }

    public static boolean checkNum(String number) {
        if (number.length() != 8) {
            System.out.println("Not valid id!");
            return false;
        }
        int first = Character.getNumericValue(number.charAt(0));
        int seven = Character.getNumericValue(number.charAt(6));
        int last = Character.getNumericValue(number.charAt(7));

        int sumDigits = first + seven;
        sumDigits %= 10;
        if (sumDigits == last) {
            System.out.println("valid id");
            return true;
        }
        return false;
    }
}