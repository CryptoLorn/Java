package homework.homework2.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(new Book());
        printables.add(new Magazine());

        Printable book = printables.get(0);
        book.print();

        Printable magazine = printables.get(1);
        magazine.print();
    }
}
