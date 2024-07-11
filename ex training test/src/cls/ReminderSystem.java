package cls;

import Utils.UtilFuncions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReminderSystem {
    private static ReminderSystem instance = null;
    private static Scanner scanner = new Scanner(System.in);
    private Set<Reminder> reminders;
    private ReminderTask task;

    private ReminderSystem() {
        this.reminders = new HashSet<>(UtilFuncions.init(10));
        start();
    }

    public static ReminderSystem getInstance() {
        if (instance == null) {
            synchronized (ReminderSystem.class) {
                if (instance == null) {
                    instance = new ReminderSystem();
                }
            }
        }
        return instance;
    }

    private void start() {
        System.out.println("System was started!!!!!\n");
        task = new ReminderTask(this.reminders);
        Thread thread = new Thread(task);
        //thread.setDaemon(true);
        thread.start();
        program();
    }

    private void program() {
        while (true) {
            showMenu();
            System.out.println("> ");
            String input = scanner.nextLine();
            System.out.println();
            switch (input) {
                case "1":
                    AddReminder(new Reminder());
                    break;
                case "2":
                    printAllReminders();
                    break;
                case "0":
                    ExitSystem();
                    break;
                default:
                    System.out.println("Not an option!!!");
            }
        }
    }

    private void ExitSystem() {
        scanner.close();
        System.out.println("Reminder System is ended!!!!");
        System.exit(0);
    }

    private void printAllReminders() {
        if (this.reminders.size() == 0) {
            System.out.println("No Reminders in the system");
        }
        this.reminders.forEach(System.out::println);
    }

    private void AddReminder(Reminder reminder) {
        if (this.reminders.add(reminder)) {
            System.out.println("Reminder was added!!!\n");
        } else {
            System.out.println("Reminder already exists!!!!\n");
        }
    }

    private void showMenu() {
        System.out.println("\n\n\n REMINDER SYSTEM Menu \n" +
                "=================================\n" +
                "1. Add New Reminder\n" +
                "2. Print All Reminders\n" +
                "\n" +
                "0. Exit System");

    }
}


