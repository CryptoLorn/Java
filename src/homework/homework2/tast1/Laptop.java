package homework.homework2.tast1;

public class Laptop extends PC {
    private String screenDiagonal;

    public Laptop() {}

    public Laptop(String CPU, String GPU, int RAM, String screenDiagonal) {
        super(CPU, GPU, RAM);
        this.screenDiagonal = screenDiagonal;
    }

    public String getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(String screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screenDiagonal='" + screenDiagonal + '\'' +
                '}';
    }
}
