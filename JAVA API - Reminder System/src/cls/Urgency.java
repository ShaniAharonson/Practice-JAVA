package cls;

import java.util.Random;

public enum Urgency {
    Normal,
    Important,
    Critical;
    public static Urgency rand(){
        Random random = new Random();
        int randomName = random.nextInt(values().length);
        return values()[randomName];
    }
}
