package cls;

import java.util.TreeSet;

public class InterestTask implements Runnable {
    private boolean isRunning = true;
    //create set of persons (as TreeSet)
    private final TreeSet<Client> clients;
    private final Integer TIME = 1000 * 60 * 60 * 24;

    public InterestTask(TreeSet<Client> clients) {
        this.clients = clients;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void run() {
        while (isRunning) {
            System.out.println("Thread starts running!!!!");
            for (Client client : clients) {
                System.out.println("id: " + client.getId() + "\n name: " + client.getName()
                        + "\n balance BEFORE UPDATE:" + client.getAccount().getBalance());
                // changing balance by interestRate
                client.getAccount().setBalance((double) (client.getAccount().getBalance() * client.getInterestRate()));
                // client after update
                System.out.println("id: " + client.getId() + "\n name: " + client.getName()
                        + "\n balance BEFORE UPDATE:" + client.getAccount().getBalance());
            }
            try {
                Thread.sleep(TIME);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread is stopped!");
        }
    }
}
