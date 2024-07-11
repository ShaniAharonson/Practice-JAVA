package cls;

import java.util.Random;


public enum Urgency {
    Normal("this is a message"),
    Important("THIS IS A MESSAGE"),
    Critical("THIS IS A MESSAGE!!!!");

    Urgency(String msg) {
    }

    static Urgency Rand() {
        Random random = new Random();
        int randomName = random.nextInt(values().length);
        return values()[randomName];
    }
}