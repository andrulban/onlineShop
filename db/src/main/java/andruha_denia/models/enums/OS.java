package andruha_denia.models.enums;

/**
 * @author andrusha
 * @since 31.08.17.
 */
public enum OS {
    MACOS("MACOS"),
    WINDOWS("WINDOWS"),
    LINUX("LINUX");

    private final String os;

    OS(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return os;
    }

    public String getOs() {
        return os;
    }
}
