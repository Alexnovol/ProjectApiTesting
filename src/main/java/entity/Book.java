package entity;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Book {

    private long id;
    private String bookTitle;
    private long authorId;
}
