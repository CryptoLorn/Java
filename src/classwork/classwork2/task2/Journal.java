package classwork.classwork2.task2;

public class Journal extends Book {
    private String type;

    public Journal() {
    }

    public Journal(String type) {
        this.type = type;
    }

    public Journal(int thickness, int numberOfPages) {
        super(thickness, numberOfPages);
    }

    public Journal(int thickness, int numberOfPages, String type) {
        super(thickness, numberOfPages);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "type='" + type + '\'' +
                '}';
    }
}
