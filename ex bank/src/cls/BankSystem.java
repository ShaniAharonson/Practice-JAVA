package cls;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BankSystem {
    private interestTask task;
    private Set<Client> clients;
    private Scanner scanner;
    
    public BankSystem(){
        this.clients = new TreeSet<>(new CliectComparator());
        task = new interestTask(clients); // initialize the task
        Thread thread = new Thread(task); // initialize the thread
        thread.start();
        //thread.setDaemon(true);
        startSystem();
    }

    private void startSystem() {
        System.out.println("System was started!!!!!\n");
        while (true) {
            showMenu();
            System.out.println("> ");
            String input = scanner.nextLine();
            System.out.println();
            switch (input) {
                case "1":
                    System.out.println("Choose R-regular / V - vip");
                    System.out.println("> ");
                    char choice = scanner.next().charAt(0);
                    switch (choice){
                        case 'V':
                            addClient(new VipClient());
                            break;
                        case 'R':
                            addClient(new RegularClient());
                    }
                    break;
                case "2":
                    deleteClient();
                    break;
                case "3":
                    System.out.println("Enter clinet id and money to withdraw");
                    System.out.println("> ");
                    int id = scanner.nextInt();
                    int money = scanner.nextInt();
                    withdrawMoney(id, money);

                    break;
                case "4":
                    System.out.println("Enter clinet id and money to deposit");
                    System.out.println("> ");
                    int ClientId = scanner.nextInt();
                    int amount = scanner.nextInt();
                    depositMoney(ClientId,amount);
                    break;
                case "5":
                    printAll();
                    break;
                case "6":

                case "0":
                    endSystem();
                    break;
                default:
                    System.out.println("Not an option!!!");
            }
        }
    }

    private void endSystem() {
        scanner.close();
        System.out.println("Bank System is ended!!!!");
        System.exit(0);
    }

    private void printAll() {
        this.clients.forEach(System.out::println);
    }

    private void depositMoney(int id, int amount) {
        Client newBalanceClient = null;
        for (Client client:clients){
            if (client.getId()==id){
                newBalanceClient=client;
            }
        }
        clients.remove(newBalanceClient);
        newBalanceClient.getAccount().depositMoney(amount);
        clients.add(newBalanceClient);
    }

    private void withdrawMoney(int id, int money) {
        Client newBalanceClient = null;
        for (Client client : clients) {
            if (client.getId() == id) {
                if (client.getAccount().getBalance() < money) {
                    System.out.println(client.getAge()+" does not enough money to withdraw");
                } else {
                    newBalanceClient = client;
                    break;
                }
            }
        }
        clients.remove(newBalanceClient);
        newBalanceClient.getAccount().withdrawMoney(money);
        clients.add(newBalanceClient);
    }

    private void deleteClient() {
        System.out.println("Please insert id of person to delete");
        System.out.println("> ");
        int id = scanner.nextInt();
        for (Client client : clients) {
            if (client.getId() == id) {
                clients.remove(client);
                System.out.println("Person was erased!!!");
                break;
            }
        } //todo: add exception
    }

    private void addClient(Client client) {
        if (this.clients.add(client)){
            System.out.println("client was added!!!\n");
        } else {
            System.out.println("Client already exists!!!\n");
        }
    }

    private void showMenu() {
        System.out.println("\n\n BANK SYSTEM MENU\n"+
                "====================================="+
                "1. Add client\n"+
                "2. Delete client\n"+
                "3. Withdraw money\n"+
                "4. deposit\n"+
                "5. Print all\n"+
                "6. Richest client\n"+
                "7. Poorest client\n"+
                "8. Count money\n"+
                "0. End System"



                );

    }
}
