package andruha_denia.models.exceptions;

/**
 * @author azozello
 * @since 09.10.17.
 */
public class WrongSourceDTO extends RuntimeException {
    public WrongSourceDTO() {
    }

    public WrongSourceDTO(String s) {
        super(s);
    }
}
