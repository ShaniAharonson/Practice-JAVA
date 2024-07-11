import AllData.Bed;
import AllData.Chair;
import AllData.Furniture;
import AllData.Table;

public class Main {
    public static void main(String[] args) {
        Furniture [] furniture = new Furniture[20];

        for (int i = 0; i < furniture.length; i++) {
            int random = (int) (Math.random()*3)+1;
            switch (random){
                case 1:
                    furniture[i] = new Chair(5,4,2,"white",4);
                    break;
                case 2:
                    furniture[i] = new Table(3,4,5,"Red",6);
                    break;
                case 3:
                    furniture[i] = new Bed(6,7,8,"Blue",true);
            }
        }
        details(furniture);
    }
    static void details(Furniture[] arr){
        for (int i = 0; i < arr.length; i++) {
            String x =arr[i].toString();
            if (arr[i] instanceof Chair){
                ((Chair) arr[i]).draw();
                ((Chair) arr[i]).getNumOfChairLegs();
            } else if (arr[i] instanceof Table) {
                ((Table) arr[i]).drw();
                ((Table) arr[i]).getNumOfSeats();
            } else if (arr[i] instanceof Bed) {
                ((Bed) arr[i]).draw();
                ((Bed) arr[i]).isDoubleBed();

            }


        }

    }
}