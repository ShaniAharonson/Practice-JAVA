import cls.Airplane;
import cls.Flight;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Flight flight1 = new Flight("1Y1","EL-AL","Israel","Greece");
        //System.out.println(flight1);
        Flight flight2 = new Flight("2L2","germany","Tel aviv","London", LocalDateTime.of(2023,8,2,9,23));
        //System.out.println(flight2);

        Airplane airplane1 = new Airplane();
        System.out.println(airplane1);
        Airplane airplane2 = new Airplane(1L,300, LocalDate.of(2024,9,1));
        System.out.println(airplane2);
        Airplane airplane3 = new Airplane(2L,400,LocalDate.of(2023,8,4),LocalDate.of(2025,4,6));
        System.out.println(airplane3);
    }
}