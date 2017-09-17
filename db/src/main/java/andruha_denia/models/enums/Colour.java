package andruha_denia.models.enums;

/**
 * @author andrusha
 * @since 31.08.17.
 */
public enum Colour {
    WHITE("WHITE"),
    BLACK("BLACK"),
    ALUMINIUM("ALUMINIUM");
    private final String colour;

    Colour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return colour;
    }

    public String getColour() {
        return colour;
    }
}
