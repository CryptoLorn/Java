package classwork.classwork2.task1;

public class Trumpet implements Tool {
    private int diameter;

    @Override
    public void play() {
        System.out.println("Plays a Trumpet with a diameter " + diameter + "mm");
    }

    public Trumpet() {
    }

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "diameter=" + diameter +
                '}';
    }
}
