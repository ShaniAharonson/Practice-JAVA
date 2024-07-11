import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        System.out.println(toCem.apply(5,10));
    }

   public static BiFunction <Integer,Integer,Integer> toCem = (number1, number2) -> ((int) Math.sqrt(Math.pow(number1,2),))/100;

    }
