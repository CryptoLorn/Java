package homework.homework1;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;
}