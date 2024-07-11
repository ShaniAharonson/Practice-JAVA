package cls;

import java.time.LocalDateTime;
import java.util.Set;

public class ReminderTask extends Thread {
    private boolean quit;
    private final Set<Reminder> reminders;

    private final Integer TIME = 1000 * 60 * 60 * 24;

    public ReminderTask(Set<Reminder> reminders) {
        this.reminders = reminders;

    }

    public void setQuit(boolean quit) {
        this.quit = quit;
    }

    public void run() {
        while (!quit) {
            boolean found = false;
            for (Reminder reminder : reminders) {
                if (reminder.getExpiration().equals(LocalDateTime.now()) && (!reminder.getPoped())) {
                    Urgency.Rand();
                    reminder.setPoped(true);
                }
                if (!found) {
                    System.out.println("message already popped!");
                }
                try {
                    Thread.sleep(TIME);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

    public void end() {
        setQuit(true);
    }
}
