package andruha_denia.models.enums;

/**
 * @author andrusha
 * @since 31.08.17.
 */
public enum GpuType {
    Integrated("Integrated");

    private final String type;
    GpuType(String type) {
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
