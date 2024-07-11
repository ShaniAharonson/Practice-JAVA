package cls;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OrderSystem {
    private final Set<Order> orders;
    private OrderTask task;
    Scanner scanner = new Scanner(System.in);

    public OrderSystem() {
        this.orders = new HashSet<>();
        task = new OrderTask(this.orders);
        Thread thread = new Thread(task);
        thread.start();
        //thread.setDaemon(true);
        startSystem();
    }

    private void startSystem() {
        System.out.println("System was started!!!!!\n");
        while (true) {
            showMenu();
            System.out.println("> ");
            String input = scanner.nextLine();
            System.out.println();
            try {
                switch (input) {
                    case "1":
                        System.out.println("Enter year, month (1-12), day, text, isImportant (true/false), isPopped(true/false):");
                        int year = scanner.nextInt();
                        int month = scanner.nextInt() - 1;
                        int day = scanner.nextInt();
                       scanner.nextLine();
                        String text = scanner.nextLine();
                        boolean important = scanner.nextBoolean();
                        boolean popped = scanner.nextBoolean();
                        scanner.nextLine();
                        Calendar readyOn = Calendar.getInstance();
                        readyOn.set(year, month, day);

                        addOrder(new Order(readyOn, text, important, popped));

                        break;

                    case "2":
                        printAllOrders();
                        break;
                    case "3":
                        Exit();
                        break;
                    default:
                        System.out.println("Not an option!!!");
                }
            }catch (Exception err){
                System.out.println(err.getMessage());
            }
        }
    }

    private void Exit() {
        scanner.close();
        System.out.println("Order reminder is ended!!!!");
        System.exit(0);
    }

    private void printAllOrders() {
        if (this.orders.size() == 0) {
            System.out.println("No people in the system");
        }
        this.orders.forEach(System.out::println);
    }


    private void addOrder(Order order) {
        if (this.orders.add(order)) {
            System.out.println("Person was added!!!\n");
        } else {
            System.out.println("Person already exists!!!!\n");
        }

    }

    private void showMenu() {
        System.out.println("\n\n\n Order System Menu \n" +
                "=================================\n" +
                "1. Add Order\n" +
                "2. Print All Orders\n" +
                "3. Exit System ");
    }

}


