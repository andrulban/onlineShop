package andruha_denia.models.enums;

/**
 * @author andrusha
 * @since 31.08.17.
 */
public enum RamType {
    LPDDR3("LPDDR3"),
    LPDDR2("LPDDR2"),
    LPDDR("LPDDR");

    private final String type;
    RamType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

    public String getType() {
        return type;
    }
}
