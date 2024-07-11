package Utils;


import cls.Reminder;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class UtilFuncions {
    public static Boolean equals(LocalDateTime Ldt1, LocalDateTime Ldt2) {
        if (Ldt1.getYear() == Ldt2.getYear()) {
            System.out.println("Equals by year");
            return true;
        } else if (Ldt1.getMonthValue() == Ldt2.getMonthValue()) {
            System.out.println("Equals by month");
            return true;
        } else if (Ldt1.getDayOfMonth() == Ldt2.getDayOfMonth()) {
            System.out.println("Equals by day");
            return true;
        } else if (Ldt1.getHour() == Ldt2.getHour()) {
            System.out.println("Equals by hour");
            return true;
        } else if (Ldt1.getMinute() == Ldt2.getMinute()) {
            System.out.println("Equal by minutes");
            return true;
        }
        return false;
    }

    public static Set<Reminder> init(int len) {
        Set<Reminder> reminders = new HashSet<>(len);
        LocalDateTime localDateTime = LocalDateTime.now();
        for (int counter = 0; counter < len; counter++) {
            reminders.add(new Reminder("Reminer" + counter, localDateTime));
            localDateTime = localDateTime.plusMinutes(1);
        }
        return reminders;
    }
}
