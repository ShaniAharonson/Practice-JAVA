package cls;

public class Book {
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;

    public static final String[] VALID_GENRES = {
            "fiction", "non-fiction", "science", "history", "biography", "fantasy"
    };

    public Book(String title, String author, String genre, boolean isAvailable) {
       setTitle(title);
        setAuthor(author);
        setGenre(genre);
        setAvailable(isAvailable);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (!isValidGenre(genre)) {
            throw new IllegalArgumentException("invalid genre" + genre);
        }
        this.genre = genre;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    private boolean isValidGenre(String genre) {
        for (String validGenre : VALID_GENRES) {
            if (validGenre.equals(genre)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}



