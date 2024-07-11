import AllData.Reminder;
import AllData.ReminderSystem;
import AllData.Urgency;

import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ReminderSystem a1 = ReminderSystem.getInstance();
        char choice;
        do {
            System.out.println("enter a- add new reminder, s- show reminders,e- exit");
            choice = s.next().charAt(0);
            switch (choice){
                case 'a':
                    for (int i = 0; i < Set.of().size(); i++) {

                    }
                    break;

            }
        } while (choice !='e');
    }
}