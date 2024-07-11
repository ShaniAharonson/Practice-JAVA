import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        int a = 2;
//        int b = 3;
//        int z = -3;
//        Math.max(a,b); // given the height
//        Math.min(a,b); // given the min
//        Math.abs(z); // given the absolute
//        Math.sqrt(4); // שורש
//        Math.round(4.6); // את המספר השלם הקרוב ביותר
//        Math.ceil(5.2); // עיגול כלפי מעלה כל הזמן
//        Math.floor(5.6); // עיגול כלפי מטה כל הזמן


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a");
//        int a  = scanner.nextInt();
//        System.out.println("Enter b");
//        int b = scanner.nextInt();
//        findYeter(a,b);
//        scanner.close();
//    }

//    public static void findYeter(int a, int b){
//
//        double z =  Math.sqrt((Math.pow(a,2))+Math.pow(b,2));
//        System.out.println(z);
//
//    }
        // כתוב תוכנית הקולטת מספר n ומדפיסה עבור כל מספר את ערכו ואת ערכו הריבועי
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number:");
//        int number = scanner.nextInt();
//        System.out.println("num: " + number + " pow : " + Math.pow(number, 2));

// כתוב תוכנית הקולטת מהמשתמש 10 מספרים שלמים והצג כמה מספרים שהוקלדו אי-זוגיים
//
        //כתוב תוכנית הקולטת מספר n ומדמה את המשחק "7 בום!": התוכנית תדפיס את כל המספרים מ- 1 ועד n, אבל כל פעם כאשר יש מספר שהוא כפולה של 7 תוצג המילה “boom!” במקום המספר
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number:");
//        int number = scanner.nextInt();
//        for (int i = 1; i < number; i++) {
//            if (i % 3 == 0 && (i % 10 + i / 10) < 5) {
//                System.out.println("the num: " + i);
//                System.out.println("sum of digits: " + (i % 10 + i / 10));
//            }
//        }


//        Scanner scanner = new Scanner(System.in);
//        int number;
//        do {
//
//            System.out.println("Enter a number");
//            number = scanner.nextInt();
//
//        } while (!(number >= 10 && number < 100 && (number/10 == number%10)));
//
//

        // יש לקלוט מספר ולייצר מספר המכיל רק את הספרות שערכן זוגי
//        int location = 1;
//        int newNum = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int x = scanner.nextInt();
//        int temp = x;
//        while (temp > 0) {
//            int digit = temp%10;
//            if (digit%2==0) {
//                newNum += location * digit;
//                location *= 10;
//            }
//            temp /=10;
//        }
//        System.out.println("the num is: "+ newNum);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter num1:");
//        int num1 = scanner.nextInt();
//        System.out.println("Enter num2: ");
//        int num2 = scanner.nextInt();
//        int newNum = 0;
//        int location = 1;
//        while (num2 > 0) {
//            newNum += (num2 % 10) * location;
//            location *= 10;
//            newNum += (num1 % 10) * location;
//            location *= 10;
//            num2 /= 10;
//            num1 /= 10;
//
//        }
//        System.out.println("new num: "+ newNum);
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("enter a number: ");
//        int number = scanner.nextInt();
//        int maxDigit = 0;
//        while (number>0){
//            int currentDigit = number%10;
//            if (currentDigit>maxDigit){
//                maxDigit=currentDigit;
//            }
//            number /=10;
//        }
//        System.out.println("The big digit is: "+ maxDigit);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a base size: ");
        int base = scanner.nextInt();
        for (int index = 1; index <= base; index++) {

            for (int star = 0; star < index; star++) {
                System.out.print("*");
            }
            for (int space = 0; space < 2 * (base - index); space++) {
                System.out.print(" ");
            }

            for (int star = 0; star < index; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//

//                System.out.print("Enter the value of N: ");
//                int N = scanner.nextInt();
//
//                // Printing the pyramid
//                for (int i = 1; i <= N; i++) {
//                    // Printing spaces
////                    for (int j = 1; j <= N - i; j++) {
////                        System.out.print(" ");
////                    }
//                    // Printing stars in increasing order
//                    for (int k = 1; k <= i; k++) {
//                        System.out.print("*");
//                    }
//                    // Printing spaces
//                    for (int l = 1; l <= 2 * (N - i); l++) {
//                        System.out.print(" ");
//                    }
//                    // Printing stars in decreasing order
//                    for (int m = 1; m <= i; m++) {
//                        System.out.print("*");
//                    }
//                    System.out.println();
//                }
//            }


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("אנא הכנס את רוחב הבסיס של המשולש:");
//        int width = scanner.nextInt();
//
//        for (int i = width; i > 0; i--) {
//            // הדפסת רווחים לפני כל שורה
//            for (int j = 0; j < width - i; j++) {
//                System.out.print(" ");
//            }
//            // הדפסת כוכביות לכל שורה
//            for (int k = 0; k < i ; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        scanner.close();




