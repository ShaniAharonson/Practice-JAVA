package cls;

import java.time.LocalDateTime;
import java.util.Set;

public class ReminderTask extends Thread {
    private boolean quit = false;
    public final Set<Reminder> reminders;

    public ReminderTask(Set<Reminder> reminders) {
        this.reminders = reminders;
    }

    public void setQuit(boolean quit) {
        this.quit = quit;
    }

    private Boolean checkingExpiration(Reminder reminder) {
        return reminder.getExpiration().equals(LocalDateTime.now());
    }

    @Override
    public void run() {

        while (!quit) {
            for (Reminder reminder : reminders) {
                if (!reminder.getPoped() && checkingExpiration(reminder)) {
                    Urgency.rand();
                    reminder.setPoped(true);

                }
            }
        }
    }

    public void end() {
        setQuit(true);
    }
}
