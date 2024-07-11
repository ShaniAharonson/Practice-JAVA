package AllData;

public class Table extends Furniture {
    public Table(int length, int width, int height, String color, int numOfSeats) {
        super(length, width, height, color);
        this.numOfSeats = numOfSeats;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    private int numOfSeats;

    @Override
    public String toString() {
        System.out.println("Table: \n");
        return super.toString()+ "numbers of seats=" + numOfSeats;
    }

    public void drw(){
        System.out.println("   =====================");
        System.out.println("  /                   /");
        System.out.println(" /                   /|");
        System.out.println("===================== |");
        System.out.println(" | |               |  |");
        System.out.println(" | |               |  |");
        System.out.println(" | |               |  |");
        System.out.println(" |                 |");
        System.out.println(" |                 |");
        System.out.println(" |                 |");

    }
}
