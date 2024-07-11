package cls;

import java.util.Random;

public enum Name {
    Moshe,
    David,
    Jack,
    Tal,
    Daniel;
    private Name(){

    }
    public static String getRandName(){
        Random random = new Random();
        int randomName = random.nextInt(values().length);
        return values()[randomName].name().toLowerCase();
    }
}
