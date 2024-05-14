package entity;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Author {

    private long id;
    private String firstName;
    private String familyName;
    private String secondName;

    public Author(long id, String firstName, String familyName) {
        this.id = id;
        this.firstName = firstName;
        this.familyName = familyName;
    }
}
