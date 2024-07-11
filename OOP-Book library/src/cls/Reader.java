package cls;

import java.util.ArrayList;

public class Reader extends Person{
    private ArrayList<Book>borrowBooks;

    public Reader(String name, int age, ArrayList<Book> borrowBooks) {
        super(name, age);
        setBorrowBooks(borrowBooks);
    }

    public ArrayList<Book> getBorrowBooks() {
        return borrowBooks;
    }

    public void setBorrowBooks(ArrayList<Book> borrowBooks) {
        this.borrowBooks = borrowBooks;
    }

    @Override
    public String toString() {
        return "Reader{" + super.toString()+
                "borrowBooks=" + borrowBooks +
                '}';
    }
}
