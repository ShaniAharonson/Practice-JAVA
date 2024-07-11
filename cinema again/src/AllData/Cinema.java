package AllData;

public class Cinema {

    public Cinema(String movieName, int movieLength, String movieOwner, int viewers) {
        this.movieName = movieName;
        this.movieLength = movieLength;
        this.movieOwner = movieOwner;
        this.viewers = viewers;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieLength() {
        return movieLength;
    }

    public void setMovieLength(int movieLength) {
        this.movieLength = movieLength;
    }

    public String getMovieOwner() {
        return movieOwner;
    }

    public void setMovieOwner(String movieOwner) {
        this.movieOwner = movieOwner;
    }

    public int getViewers() {
        return viewers;
    }

    public void setViewers(int viewers) {
        this.viewers = viewers;
    }

    public int getStudentdiscount() {
        return studentdiscount;
    }

    public int getTeacherdiscount() {
        return teacherdiscount;
    }

    private String movieName;
    private int movieLength;

    public int getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(int moviePrice) {
        this.moviePrice = moviePrice;
    }

    private int moviePrice;
    private String movieOwner;
    private int viewers;
    private final int studentdiscount= (int) (Math.random()*11+11);
    private final int teacherdiscount = (int) (Math.random()*6+5);

    @Override
    public String toString() {
        return "Cinema{" +
                "movieName='" + movieName + '\'' +
                ", movieLength=" + movieLength +
                ", movieOwner='" + movieOwner + '\'' +
                ", viewers=" + viewers +
                ", studentdiscount=" + studentdiscount +
                ", teacherdiscount=" + teacherdiscount +
                '}';
    }
}