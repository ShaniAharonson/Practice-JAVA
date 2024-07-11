import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Shape;
import org.w3c.dom.css.Rect;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char choice;
        ArrayList<Shape> arrShapes = new ArrayList<>();
        do {
            System.out.print("please enter c-add circle, r-add rectangle, p-print, s-save to file, l-load file, e-exit: ");
            choice = scanner.next().charAt(0);
            switch (choice) {
                case 'c':
                    Circle c = new Circle(1, 2, 3);
                    arrShapes.add(c);
                    break;
                case 'r':
                    arrShapes.add(new Rectangle(4, 5, 6, 7));
                    break;
                case 'p':
                    for (int i = 0; i < arrShapes.size(); i++) {
                        arrShapes.get(i).Print();
                    }
                    break;
                case 's':
                    FileOutputStream fs1 = new FileOutputStream("data.txt");
                    DataOutputStream w1 = new DataOutputStream(fs1);
                    w1.writeInt(arrShapes.size());
                    for (int i = 0; i < arrShapes.size(); i++) {
                        if (arrShapes.get(i) instanceof Circle) {
                            w1.writeChar('c');
                            w1.writeInt(arrShapes.get(i).getX());
                            w1.writeInt(arrShapes.get(i).getY());
                            w1.writeInt(((Circle) arrShapes.get(i)).getRadius());
//                            Circle c1=(Circle) arrShapes.get(i);
//                            w1.writeInt(c1.getRadius());
                        } else if (arrShapes.get(i) instanceof Rectangle) {
                            w1.writeChar('r');
                            w1.writeInt(arrShapes.get(i).getX());
                            w1.writeInt(arrShapes.get(i).getY());
                            w1.writeInt(((Rectangle) arrShapes.get(i)).getWidth());
                            w1.writeInt(((Rectangle) arrShapes.get(i)).getHeight());
                            // Rectangle r = (Rectangle) arrShapes.get(i);
                            // w1.writeInt(r.getWidth());
                            // w1.writeInt(r.getHeight());
                        }
                    }
                    w1.close();
                    fs1.close();
                    break;
                case 'l':
                    FileInputStream fs2=new FileInputStream("data.txt");
                    DataInputStream r1=new DataInputStream(fs2);
                    arrShapes.clear();
                    int size1=r1.readInt();
                    char shapeType;
                    int x,y,r,w,h;
                    for (int i = 0; i < size1; i++) {
                        shapeType=r1.readChar();
                        if (shapeType=='c'){
                            x=r1.readInt();
                            y=r1.readInt();
                            r=r1.readInt();
                            arrShapes.add(new Circle(x,y,r));
                        }
                        else if (shapeType=='r'){
                            x=r1.readInt();
                            y=r1.readInt();
                            w=r1.readInt();
                            h=r1.readInt();
                            arrShapes.add(new Rectangle(x,y,w,h));
                        }
                    }
                    r1.close();
                    fs2.close();
                    break;
            }
        }
        while (choice != 'e');
    }
}