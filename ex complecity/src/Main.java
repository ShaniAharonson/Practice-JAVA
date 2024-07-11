import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // question 1
        // System.out.println(containsAllDigits(1357));
        //isBalance();
    }

    private static void isBalance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a size for an array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        int x = (int) (Math.random() * size + 1);
        System.out.println("X is: "+ x);

        int count1 = 0;
        int count2= 0;
        for (int counter = 0; counter < x; counter++) {
            arr[counter] = (int) (Math.random() * 6 + 1);
            count1 += arr[counter];
            System.out.println(arr[counter]);

        }
        for (int index = x+1; index < arr.length ; index++) {
            count2 += arr[index];
        }
            if (count1 == count2) {
                System.out.println("The array is balanced!");
            } else {
                System.out.println("The array is not balanced!");
            }
        }

    static int containsAllDigits(int number) {
        String numberString = String.valueOf(number);

        char digit;
        for (digit = '0'; digit <= '9'; digit++) {
            if (numberString.indexOf(digit) == -1) {
                System.out.println(digit);

            }
        }
        return digit;

    }
}

