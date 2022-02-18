package classwork1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;
}