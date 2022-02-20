package classwork.classwork2.task2;

public class Papyrus {
    private int thickness;

    public Papyrus() {
    }

    public Papyrus(int thickness) {
        this.thickness = thickness;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Papyrus{" +
                "thickness=" + thickness +
                '}';
    }
}
