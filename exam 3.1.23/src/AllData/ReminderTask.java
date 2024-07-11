package AllData;

import java.time.LocalDateTime;
import java.util.Set;

public class ReminderTask extends Thread {
    private boolean isQuit;
    private final Set<Reminder> reminders;

    public ReminderTask(Set<Reminder> reminders) {
        this.reminders = reminders;
    }

    @Override
    public void run() {
        while (!isQuit) {
            for (Reminder item : reminders) {
                if (item.getExpiration() < LocalDateTime.now()) {
                    System.out.println(Urgency.normal);
                    System.out.println("this is a message");
                } else if (item.getExpiration() == LocalDateTime.now()) {
                    System.out.println(Urgency.important);
                    System.out.println("THIS IS A MESSAGE");
                } else if (item.getExpiration() > LocalDateTime.now()) {
                    System.out.println(Urgency.critical);
                    System.out.println("THIS IS A MESSAGE!!!!");
                }
                //check date
                //if true check poped
                //if false prine message
            }
            if (isQuit) {
                break;
            }
        }
    }






    public boolean isQuit() {
        return isQuit;
    }

    public void setQuit(boolean quit) {
        isQuit = quit;
    }

    public Set<Reminder> getReminders() {
        return reminders;
    }


    static void end(boolean isQuit){
        isQuit = true;
    }
}
