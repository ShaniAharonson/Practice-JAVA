package cls;

public class ImportantOrderTask implements Runnable {
    private final Order order;
    private boolean isRunning = true;

    public ImportantOrderTask(Order order) {
        this.order = order;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000*60);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Reminder (Due Date): " + order.getText());


        }


    }
}
