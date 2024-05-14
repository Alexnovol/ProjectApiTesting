package models.post;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import entity.Author;
import entity.Book;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class GettingAuthorsBooksXmlRs {

    private HashMap<Author, List<Book>> authorsBooks;

    private int errorCode;
    private String errorMessage;
    private String errorDetails;
}
