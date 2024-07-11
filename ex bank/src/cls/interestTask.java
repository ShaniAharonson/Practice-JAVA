package cls;

import java.util.Set;
import java.util.TreeSet;

public class interestTask implements Runnable {
    private TreeSet<Client> clients;
    private final Integer TIME = 1000 * 60 * 60 * 24;
    private boolean isRunning = true;

    public interestTask(Set<Client> clients) {
        this.clients = clients;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        System.out.println("The thread is starting!!");
        while (isRunning) {
            boolean found = false;
            for (Client client : clients) {
                System.out.println(
                        "Clinet id: " + client.getId() + "\n" +
                                "Client name: " + client.getName() + "\n" +
                                "Balance *before* update :" + client.getAccount().getBalance() + "\n");

                client.getAccount().setBalance(client.getAccount().getBalance() * client.getInterestRate());

                System.out.println(
                        "Clinet id: " + client.getId() + "\n" +
                                "Client name: " + client.getName() + "\n" +
                                "Balance *after* update :" + client.getAccount().getBalance() + "\n");
                ;

            }
            try {
                Thread.sleep(TIME);
                isRunning = false;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("The thread stopped!!!");
    }

}
