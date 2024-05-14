package models.get;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import entity.Author;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class GettingAuthorsBooksRs {

    private HashMap<Author, List<Book>> authorsBooks;

    private int errorCode;
    private String errorMessage;
    private String errorDetails;

}
