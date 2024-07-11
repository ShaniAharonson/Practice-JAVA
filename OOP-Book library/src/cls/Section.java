package cls;

import java.util.ArrayList;

public class Section {
    private String name;
    private Librarian librarian;
    private ArrayList<Book> books;

    public Section(String name, Librarian librarian, ArrayList<Book> books) {
        setName(name);
        setLibrarian(librarian);
        setBooks(books);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Section{" +
                "name='" + name + '\'' +
                ", librarian=" + librarian +
                ", books=" + books +
                '}';
    }
}
