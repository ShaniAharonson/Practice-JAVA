package FactoryUtils;

import cls.Reminder;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Utils {
    public static Boolean equals(LocalDateTime ldt1, LocalDateTime ldt2){
        if (ldt1.getYear() == ldt2.getYear()){
            System.out.println("equals by year!");
            return true;
        }
        if (ldt1.getMonth().equals(ldt2.getMonth())){
            System.out.println("equals by month");
            return true;
        }
        if (ldt1.getDayOfMonth() == ldt2.getDayOfMonth()){
            System.out.println("equals by date of month");
            return true;
        }
        if (ldt1.getHour() == ldt2.getHour()){
            System.out.println("equals by hour");
            return true;
        }
        if (ldt1.getMinute() == ldt2.getMinute()){
            System.out.println("equal by minutes");
            return true;
        }
        return false;
    }
    public static Set<Reminder> init(int len){
        Set<Reminder> reminders = new HashSet<>();
        LocalDateTime currentTime = LocalDateTime.now();

        for (int i = 0; i < len; i++) {
            reminders.add(new Reminder("reminder"+i,currentTime));
            currentTime = currentTime.plusMinutes(1);
        }
        return reminders;
    }
}
