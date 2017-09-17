package andruha_denia.models.enums;

/**
 * @author andrusha
 * @since 31.08.17.
 */
public enum BatteryType {
    PORTABLE("PORTABLE"),
    UNPORTABLE("UNPORTABLE");
    private final String type;
    BatteryType(String type) {
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
