public class maintainancePerson {
    public maintainancePerson(String name, int id, boolean isBusy) {
        this.name = name;
        this.id = id;
        this.isBusy = isBusy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }

    private String name;
    private int id;
    private boolean isBusy;

    @Override
    public String toString() {
        return "maintainancePerson{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", isBusy=" + isBusy +
                '}';
    }
}
