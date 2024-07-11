package cls;

import Statistics.BankStatistics;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class BankSystem {
    private InterestTask task;
    private TreeSet<Client> clients;
    private static Scanner scanner = new Scanner(System.in);

    public BankSystem() {
        this.clients = new TreeSet<>();
        task = new InterestTask(clients);
        Thread thread = new Thread(task);
        thread.start();
        //thread.setDaemon(true);
        try {
            startSystem();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void startSystem() throws Exception {
        System.out.println("System was started!!!!\n");
        try {
            while (true) {
                showMenu();
                System.out.print("> ");
                String input = scanner.nextLine();
                System.out.println();
                switch (input) {
                    case "1":
                        System.out.println("Enter V or R");
                        System.out.print("> ");
                        char choice = scanner.next().charAt(0);
                        switch (choice) {
                            case 'V':
                                AddClient(new VipClient());
                                break;
                            case 'R':
                                AddClient(new RegularClient());
                                break;
                            default:
                                System.out.println(" you can type only R or V");
                        }
                        break;
                    case "2":
                        deleteClient();
                        break;
                    case "3":
                        withdrawMoney();
                        break;
                    case "4":
                        depositMoney();
                        break;
                    case "5":
                        printAllClients();
                        break;
                    case "6":
                        System.out.println("The richest person is: " + BankStatistics.getRichestClient(new ArrayList<>(this.clients)));
                        break;
                    case "7":
                        System.out.println("The Poorest person is: " + BankStatistics.getPoorestClient(new ArrayList<>(this.clients)));
                        break;
                    case "8":
                        System.out.println("Bank balance: " + BankStatistics.AllMoneyInBank(new ArrayList<>(this.clients)));
                        break;
                    case "0":
                        endSystem();
                        break;
                    default:
                        System.out.println("Not an option!");
                }

            }
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }

    private void endSystem() {
        scanner.close();
        System.out.println("Interest task is ended!!");
        System.exit(0);
    }

    private void printAllClients() {
        if (this.clients.isEmpty()) {
            System.out.println("No clients in the system");
            return;
        }
        // converting clients to ArrayList
//       List<Client> clients1 = new ArrayList<>(this.clients);
//       Collections.sort(clients1);
        this.clients.forEach(System.out::println);
    }

    private void depositMoney() {
        Client clientToDeposit = null;
        System.out.println("Enter client id");
        System.out.print("> ");
        int id = scanner.nextInt();
        System.out.println("Enter amount to deposit");
        System.out.print("> ");
        double deposit = scanner.nextDouble();
        for (Client client : clients) {
            if (client.getId() == id) {
                clientToDeposit = client;
            }
        }
        clients.remove(clientToDeposit);
        clientToDeposit.getAccount().setBalance(clientToDeposit.getAccount().getBalance() + deposit);
        clients.add(clientToDeposit);
    }

    private void withdrawMoney() throws Exception {
        System.out.println("Enter client id");
        System.out.print("> ");
        int id = scanner.nextInt();
        System.out.println("Enter amount to withdraw");
        System.out.print("> ");
        double amount = scanner.nextDouble();
        Client clientToChange = null;
        for (Client client : clients) {
            if (client.getId() == id) {
                if (client.getAccount().getBalance() > amount) {
                    throw new Exception("not enough money in your account..");
                } else {
                    clientToChange = client;
                }
            }
        }
        clients.remove(clientToChange);
        assert clientToChange != null;
        clientToChange.getAccount().setBalance(clientToChange.getAccount().getBalance() - amount);
        clients.add(clientToChange);

    }

    private void deleteClient() {
        System.out.println("please enter id of client to delete");
        System.out.print("> ");
        int id = scanner.nextInt();
        for (Client client : clients) {
            if (client.getId() == id) {
                clients.remove(client);
                System.out.println("client has removed!!");
                break;
            }
        }
    }

    private void AddClient(Client client) {
        clients.add(client);
    }

    private void showMenu() {
        System.out.println("\n\n\n Bank System menu \n" +
                "=====================================\n" +
                "1. Add client \n" +
                "2. Delete client \n" +
                "3. Withdraw money\n" +
                "4. Deposit money \n" +
                "5. Print all clients\n" +
                "6. The richest client\n" +
                "7. The poorest client\n" +
                "8. Print bank balance\n" +
                "0. Exit System"
        );
    }
}
