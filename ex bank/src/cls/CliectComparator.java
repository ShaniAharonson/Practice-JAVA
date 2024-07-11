package cls;

import java.util.Comparator;

public class CliectComparator implements Comparator<Client> {

    @Override
    public int compare(Client o1, Client o2) {
        return (int) (o1.getAccount().getBalance()-o2.getAccount().getBalance());
    }
}
