package Statistics;

import cls.Client;

import java.util.ArrayList;

public class BankStatistics {
    // richest client, poorest client, all money in bank
    public static Client getRichestClient(ArrayList<Client> clients) {
        Double max = clients.get(0).getAccount().getBalance();
        Client richestClient = clients.get(0);
        for (int i = 0; i < clients.size(); i++) {
            Client temp = clients.get(i);
            if (temp.getAccount().getBalance() > max) {
                max = temp.getAccount().getBalance();
                richestClient = temp;
            }
        }
        return richestClient;

    }

    public static Client getPoorestClient(ArrayList<Client> clients) {
        Double min = clients.get(0).getAccount().getBalance();
        Client poorestClient = null;
        for (int i = 0; i < clients.size(); i++) {
            Client temp = clients.get(i);
            if (temp.getAccount().getBalance() < min) {
                min = temp.getAccount().getBalance();
                poorestClient = temp;
            }
        }
        return poorestClient;
    }


    public static double AllMoneyInBank(ArrayList<Client> clients){
        double sum = 0;
        for (Client client:clients){
            sum+=Math.abs(client.getAccount().getBalance());
        }
        return sum;
    }
}

