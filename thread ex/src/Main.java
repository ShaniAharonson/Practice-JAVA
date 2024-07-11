import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    static boolean isFinished = false;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       Thread t = new Thread(new Runnable() {
           @Override
           public void run() {
               while (! isFinished) {
                   LocalTime t1 = LocalTime.now();
                   System.out.println(String.format("%02d:%02d:%02d",t1.getHour(),t1.getMinute(),t1.getSecond()));
                   try {
                       Thread.sleep(5000);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
               System.out.println("end of thread");
           }
       });
       t.start();
       char choice;
       do {
           System.out.println("Please enter a-add 2 numbers, e-exit");
           choice = s.next().charAt(0);
          if(choice == 'a'){
                   System.out.println("Enter 2 numbers: ");
                   int num1 = s.nextInt();
                   int num2 = s.nextInt();
                   System.out.println("the sum is: "+ num1+num2);
           }

       } while (choice != 'e');
       isFinished = true;
        System.out.println("end main");
    }
}