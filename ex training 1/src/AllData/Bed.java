package AllData;

public class Bed extends Furniture {
    public Bed(int length, int width, int height, String color, boolean isDoubleBed) {
        super(length, width, height, color);
        this.isDoubleBed = isDoubleBed;
    }

    public boolean isDoubleBed() {
        return isDoubleBed;
    }

    public void setDoubleBed(boolean doubleBed) {
        isDoubleBed = doubleBed;
    }

    private boolean isDoubleBed;

    @Override
    public String toString() {
        System.out.println("Bed: \n");
        return super.toString()+ "is double bed? :" + isDoubleBed;
    }

    public void draw(){
        System.out.println("   ||");
        System.out.println("   ||                   ||");
        System.out.println("||/||___                ||");
        System.out.println("|| /`   )____________||_/|");
        System.out.println("||/___ //_/_/_/_/_/_/||/ |");
        System.out.println("||(___)/_/_/_/_/_/_/_||  |");
        System.out.println("||     |_|_|_|_|_|_|_|| /|");
        System.out.println("||     | | | | | | | ||/||");
        System.out.println("||~~~~~~~~~~~~~~~~~~~||");
        System.out.println("||                   ||");


    }

}
