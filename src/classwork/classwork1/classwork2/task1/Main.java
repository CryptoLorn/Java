package classwork.classwork1.classwork2.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tool> tools = new ArrayList<>();

        tools.add(new Guitar(6));
        tools.add(new Drum("16х22"));
        tools.add(new Trumpet(11));

        for (int i = 0; i < tools.size(); i++) {
            tools.get(i).play();
        }
    }
}
