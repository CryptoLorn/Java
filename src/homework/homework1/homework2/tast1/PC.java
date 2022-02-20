package homework.homework1.homework2.tast1;

public class PC {
    private String CPU;
    private String GPU;
    private int RAM;

    @Override
    public String toString() {
        return "PC{" +
                "CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", RAM=" + RAM +
                '}';
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public int getRAM() {
        return RAM;
    }

    public PC() {}

    public PC(String CPU, String GPU, int RAM) {
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
    }
}
