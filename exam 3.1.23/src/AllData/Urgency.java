package AllData;

public enum Urgency {
    normal,
    important,
    critical;

    public static Urgency Rand(Urgency[] values){
        return values()[(int) (Math.random() * values().length)];
    }
}
