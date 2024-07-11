package AllData;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReminderSystem {
    private static Scanner scanner;
    private Set<Reminder> reminders;
    private static ReminderSystem task=null;
    private ReminderSystem() {
        reminders = new HashSet<>(10);

    }

    public static ReminderSystem getInstance() {
        if (task==null){
            task = new ReminderSystem();
        }
        return reminderSystem;
    }
public void start(){
    System.out.println("start");
    scanner = new Scanner(System.in);
    task = new ReminderTask();
    task.start();
}
public void program(){

}
    public void end() {
        scanner.close();
        task.end();

    }
    private static ReminderSystem reminderSystem = new ReminderSystem();

    public static ReminderSystem getReminderSystem() {
        return reminderSystem;
    }

    public static void setReminderSystem(ReminderSystem reminderSystem) {
        ReminderSystem.reminderSystem = reminderSystem;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        ReminderSystem.scanner = scanner;
    }

    public Set<Reminder> getReminders() {
        return reminders;
    }

    public void setReminders(Set<Reminder> reminders) {
        this.reminders = reminders;
    }

    public ReminderSystem getTask() {
        return task;
    }

    public void setTask(ReminderSystem task) {
        this.task = task;
    }




}
