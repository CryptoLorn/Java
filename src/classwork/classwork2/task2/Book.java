package classwork.classwork2.task2;

public class Book extends Papyrus{
    private int numberOfPages;

    public Book() {
    }

    public Book(int thickness, int numberOfPages) {
        super(thickness);
        this.numberOfPages = numberOfPages;
    }

    public Book(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "numberOfPages=" + numberOfPages +
                '}';
    }
}
