package classwork.classwork2.task1;

public class Drum implements Tool {
    private String size;

    @Override
    public void play() {
        System.out.println("Plays the Drum " + size + " size!");
    }

    public Drum() {
    }

    public Drum(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Drum{" +
                "size=" + size +
                '}';
    }
}
