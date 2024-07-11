import java.io.*;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //********** serialization - write object to stream (file)
        Person p1=new Person("simcha",33);
        FileOutputStream fs1=new FileOutputStream("a.txt");
        ObjectOutputStream writer=new ObjectOutputStream(fs1);
        writer.writeObject(p1);;
        writer.close();
        fs1.close();

        //********** deserialization - read  object from stream (file)
        FileInputStream fs2=new FileInputStream("a.txt");
        ObjectInputStream reader=new ObjectInputStream(fs2);
        Person p2= (Person)reader.readObject();
        System.out.println(p2);
    }
}
