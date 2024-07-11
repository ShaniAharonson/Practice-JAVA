package AllData;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Utils {
    static boolean equalsByYear(LocalDateTime ldt1, LocalDateTime ldt2) {
        int year1 = ldt1.getYear();
        int year2 = ldt2.getYear();
        int month1 = ldt1.getMonthValue();
        int month2 = ldt2.getMonthValue();
        int day1 = ldt1.getDayOfMonth();
        int day2 = ldt2.getDayOfMonth();
        int hour1 = ldt1.getHour();
        int hour2 = ldt2.getHour();
        int min1 = ldt1.getMinute();
        int min2 = ldt2.getMinute();
        if (year1 == year2 || month1 == month2 || day1 == day2 || hour1 == hour2 || min1 == min2) {
            return true;
        }
        return false;
    }

    static Set<Reminder> init(int len) {
        Set<Reminder> reminders = new HashSet<>();
        LocalDateTime current = LocalDateTime.now();
        for (int i = 0; i < len; i++) {
            Reminder reminder = new Reminder("reminder" + i, current, Urgency.values()[(int) (Math.random() * 4)]);
            current.plusMinutes(1);

        }

        return reminders;


    }
}
