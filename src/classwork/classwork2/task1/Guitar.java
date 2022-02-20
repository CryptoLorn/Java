package classwork.classwork2.task1;

public class Guitar implements Tool {
    private int numberOfStrings;

    @Override
    public void play() {
        System.out.println("Plays a Guitar with " + numberOfStrings + " strings!");
    }

    public Guitar() {
    }

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "numberOfStrings=" + numberOfStrings +
                '}';
    }
}
