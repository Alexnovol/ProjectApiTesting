package models.get;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import entity.Author;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class GettingAuthorsBooksXmlRs {

    private int errorCode;
    private String errorMessage;
    private String errorDetails;

    @Getter
    @Setter
    @EqualsAndHashCode
    @ToString
    public class Book {

        private long id;
        private String bookTitle;
        private Author author;

    }
}
