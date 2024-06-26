package models.post;

import com.fasterxml.jackson.annotation.JsonInclude;
import entity.Author;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class SavingNewBookRq {

    private String bookTitle;
    private Author author;
}
