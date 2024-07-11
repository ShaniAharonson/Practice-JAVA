import AllData.*;

public class Main {
    public static void main(String[] args) {
        Cinema c = new Cinema("avatar", 90, "ani", 100);

        Person[] people = new Person[c.getViewers()];
fun1(people);
fun2(people,c);

    }

    static void fun1(Person[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int choice = (int) (Math.random() * 3);
            switch (choice) {
                case 0:
                        arr[i] = new Student(Gender.male, "student" + i, 30 + i, "1233456", "kan", "bible");
                    break;
                case 1:
                        arr[i] = new Teacher(Gender.female, "yafa", 50, "12234", "ff", 50);
                    break;
                case 2:
                        arr[i] = new Worker(Gender.male, "sfd", 40, "1234", 5555);
                    break;
            }

        }
    }
    static void fun2(Person[] arr, Cinema c1){
        int totalAmount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Worker){
                totalAmount+=c1.getMoviePrice()
            }

        }
    }
}