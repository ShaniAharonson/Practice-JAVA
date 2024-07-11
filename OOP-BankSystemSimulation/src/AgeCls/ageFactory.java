package AgeCls;

public class ageFactory {
    public static Double getRandomAge(){
        int age = (int) (Math.random()*105+16);
        return (double) age;
    }
}
