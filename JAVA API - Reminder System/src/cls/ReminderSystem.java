package cls;

import FactoryUtils.Utils;

import java.security.spec.RSAOtherPrimeInfo;
import java.time.LocalDateTime;
import java.util.*;

public class ReminderSystem {
    private static Scanner scanner;
    private static ReminderSystem instance;

    private Set<Reminder> reminders;
    private ReminderTask task;

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

    public ReminderSystem() {
        this.reminders = Utils.init(10);
    }
    public void start(){
        System.out.println("The system is started!!");
        scanner = new Scanner(System.in);
        task = new ReminderTask(reminders);
        task.start();
        program();

    }

    private void program() {
        try {


        System.out.println("The program is started!!");
        while (true){
            showMenu();
            String input = scanner.nextLine();
            switch (input){
                case "1":
                    AddReminder(new Reminder());
                    break;
                case "2":
                    displaySorted();
                    break;
                case "0":
                    end();
            }

        }
        } catch (Exception err){
            System.out.println(err.getMessage());
        }
    }

    private void end() {
        scanner.close();
        task.end();
    }

    private void displaySorted() {
        try {
            if (this.reminders.isEmpty()) {
                System.out.println("No Reminders in the system!!\n");
                return;
            }
            List<Reminder> reminders = new ArrayList<>(this.reminders);
            Collections.sort(reminders);
            System.out.println(reminders);
        }catch (Exception err){
            System.out.println(err.getMessage());
        }
    }

    private void AddReminder(Reminder reminder) {
        try {
            System.out.println("Enter text and minutes from now");
            System.out.println(">");
            String text = scanner.nextLine();
            int minutes = scanner.nextInt();
            LocalDateTime expiration  = LocalDateTime.now().plusMinutes(minutes);
            reminder = new Reminder(text,expiration);
            if(reminders.add(reminder)){
                System.out.println("New Reminder was added!!!\n");
            } else {
                System.out.println("This reminder is already exists!!!\n");
            }
        } catch (Exception err){
            System.out.println(err.getMessage());
        }

    }

    private void showMenu() {
        System.out.println("\n\n\nReminder System Menu\n" +
                "================================\n"+
                "1. Add new Reminder\n"+
                "2. Show All Reminders\n"+
                "0. Exit System"
        );
    }


}
