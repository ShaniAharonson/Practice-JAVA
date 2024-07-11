package cls;

import java.util.Calendar;
import java.util.Set;

public class OrderTask implements Runnable {
    private final Set<Order> orders;

    public void setRunning(boolean running) {
        isRunning = running;
    }

    private boolean isRunning = true;

    public OrderTask(Set<Order> orders) {
        this.orders = orders;
    }

    @Override
    public void run() {
        while (isRunning) {
            for (Order order : orders) {
                Calendar now = Calendar.getInstance();
                if (now.after(order.getReadyOn())) {
                    System.out.println("Reminder: " + order.getText() + "\n" + "is important: " + order.isImportant());
                    if (order.isImportant()) {
                        new ImportantOrderTask(order).run();
                    }
                }
            }

        }
    }
}
