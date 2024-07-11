package AllData;

public class Chair extends Furniture {
    public Chair(int length, int width, int height, String color, int numOfChairLegs) {
        super(length, width, height, color);
        NumOfChairLegs = numOfChairLegs;
    }

    public int getNumOfChairLegs() {
        return NumOfChairLegs;
    }

    public void setNumOfChairLegs(int numOfChairLegs) {
        NumOfChairLegs = numOfChairLegs;
    }

    private int NumOfChairLegs;

    @Override
    public String toString() {
        System.out.println("Chair: \n");
        return super.toString()+ "NumOfChairLegs=" + NumOfChairLegs;
    }
    public void draw(){
        System.out.println("  i______i");
        System.out.println("  I______I");
        System.out.println("  I      I");
        System.out.println("  I______I");
        System.out.println(" /      /I");
        System.out.println("(______( I");
        System.out.println("I I    I I");
        System.out.println("I      I");

    }
}
