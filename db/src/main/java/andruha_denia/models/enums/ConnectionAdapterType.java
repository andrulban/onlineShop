package andruha_denia.models.enums;

/**
 * @author andrusha
 * @since 31.08.17.
 */
public enum ConnectionAdapterType {
    WIFI("WIFI"),
    BLUETOOTH("BLUETOOTH");
    private final String type;

    ConnectionAdapterType(String type) {
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
