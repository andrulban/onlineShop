package andruha_denia.models.enums;

/**
 * @author andrusha
 * @since 31.08.17.
 */
public enum Manufacturer {
    APPLE("APPLE"),
    MICROSOFT("MICROSOFT");
    private final String manufacturer;

    Manufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
