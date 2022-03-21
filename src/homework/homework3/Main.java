package homework.homework3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> skills1 = new ArrayList<>();
        skills1.add("java");
        skills1.add("js");
        skills1.add("c++");
        Car car1 = new Car("Toyota", 2021, 250);
        User user1 = new User(1, "Vasya", "Pupkin", "asd@asd.com", 31, Gender.MALE, skills1, car1);

        ArrayList<String> skills2 = new ArrayList<>();
        skills2.add("HTML");
        skills2.add("js");
        Car car2 = new Car("Mazda", 2008, 200);
        User user2 = new User(2, "Katia", "Norn", "norn@asd.com", 28, Gender.FEMALE, skills2, car2);

        ArrayList<String> skills3 = new ArrayList<>();
        skills3.add("HTML/CSS");
        skills3.add("Python");
        skills3.add("PHP");
        Car car3 = new Car("KIA", 2018, 180);
        User user3 = new User(3, "Anna", "Korlea", "korlea@asd.com", 22, Gender.FEMALE, skills3, car3);

        ArrayList<String> skills4 = new ArrayList<>();
        skills4.add("HTML/CSS");
        skills4.add("JS");
        skills4.add("React");
        skills4.add("Java");
        Car car4 = new Car("BMW", 2015, 220);
        User user4 = new User(4, "Andrii", "Lorn", "lorn@asd.com", 28, Gender.MALE, skills4, car4);

        ArrayList<String> skills5 = new ArrayList<>();
        skills5.add("HTML");
        skills5.add("C#");
        Car car5 = new Car("Nissan", 2010, 180);
        User user5 = new User(5, "Kolya", "Naum", "naum@asd.com", 21, Gender.MALE, skills5, car5);

        ArrayList<String> skills6 = new ArrayList<>();
        skills6.add("HTML/CSS");
        skills6.add("JS");
        skills6.add("Angular");
        skills6.add("PHP");
        skills6.add("GO");
        Car car6 = new Car("Mercedes", 2020, 260);
        User user6 = new User(6, "Slavik", "Kraft", "kraft@asd.com", 29, Gender.MALE, skills6, car6);

        ArrayList<String> skills7 = new ArrayList<>();
        skills7.add("HTML");
        skills7.add("JS");
        skills7.add("JAVA");
        Car car7 = new Car("Opel", 2019, 170);
        User user7 = new User(7, "Tania", "Shult", "shult@asd.com", 20, Gender.FEMALE, skills7, car7);

        ArrayList<String> skills8 = new ArrayList<>();
        skills8.add("HTML");
        skills8.add("C++");
        Car car8 = new Car("Nissan", 2014, 200);
        User user8 = new User(8, "Kristina", "Qery", "qery@asd.com", 35, Gender.FEMALE, skills8, car8);

        ArrayList<String> skills9 = new ArrayList<>();
        skills9.add("HTML");
        skills9.add("Ruby");
        skills9.add("GO");
        Car car9 = new Car("Peugeot", 2018, 180);
        User user9 = new User(9, "Ihor", "Matvi", "matvi@asd.com", 28, Gender.MALE, skills9, car9);

        ArrayList<String> skills10 = new ArrayList<>();
        skills10.add("HTML/CSS");
        skills10.add("Python");
        skills10.add("PHP");
        skills10.add("JS");
        Car car10 = new Car("Toyota", 2014, 210);
        User user10 = new User(10, "Diana", "Senesh", "senesh@asd.com", 26, Gender.FEMALE, skills10, car10);


        //Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків

        HashSet<User> users = new HashSet<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);

        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()) {
            User user = iterator.next();

            if (user.getGender() == Gender.MALE) {
                iterator.remove();
            }
        }

        System.out.println(users);

        //Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого

//        TreeSet<User> usersTreeSet = new TreeSet<>();
//        usersTreeSet.add(user1);
//        usersTreeSet.add(user2);
//        usersTreeSet.add(user3);
//        usersTreeSet.add(user4);
//        usersTreeSet.add(user5);
//        usersTreeSet.add(user6);
//        usersTreeSet.add(user7);
//        usersTreeSet.add(user8);
//        usersTreeSet.add(user9);
//        usersTreeSet.add(user10);
//
//        System.out.println(usersTreeSet);
    }
}
