package homework.homework3;

import lombok.*;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User implements Comparable<User>{
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private ArrayList<String> skills = new ArrayList<>();
    private Car car;

    @Override
    public int compareTo (User o) {
        return this.getSkills().size() - o.getSkills().size();
    }
}
