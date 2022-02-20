package classwork.classwork2.task2;

public class Comics extends Book {
    private String genre;

    public Comics() {
    }

    public Comics(String genre) {
        this.genre = genre;
    }

    public Comics(int thickness, int numberOfPages) {
        super(thickness, numberOfPages);
    }

    public Comics(int thickness, int numberOfPages, String genre) {
        super(thickness, numberOfPages);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
