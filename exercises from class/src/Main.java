import AllData.Circle;
import AllData.Rectangle;
import AllData.Shape;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

        ArrayList <Shape> arrShapes = new ArrayList<>();
        char choice;
        int i = 0;
        do {
            System.out.println("Enter c- add c, r-add r, x-radius, d-widths, e-exit");
            choice = s.next().charAt(0);
            switch (choice) {
                case 'c':
                        arrShapes.add(new Circle(1, 2, 3));
                    break;
                case 'r':
                        arrShapes.add(new Rectangle(4, 5, 6, 7));
                    break;
                case 'p':
                    for (int j = 0; j <i; j++) {
                        arrShapes.get(j).Print();
                    }
                    break;
                case 'x':
                    for (int j = 0; j<arrShapes.size(); j++) {
                        if (arrShapes.get(j) instanceof Circle){
                            System.out.println(arrShapes.add(arrShapes.get(i),(Circle) arrShapes.get(j)).getRadius())
                    }
                    break;
                case 'd':
                    for (int j = 0; j<i; j++) {
                        if (arrShapes[j] instanceof Rectangle){
                            System.out.println(((Rectangle) arrShapes[j]).getWidth());
                        }
                    }
                    break;
            }
        } while (choice != 'e');
    }
}