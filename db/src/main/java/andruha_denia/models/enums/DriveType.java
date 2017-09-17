package andruha_denia.models.enums;

/**
 * @author andrusha
 * @since 31.08.17.
 */
public enum DriveType {
    SSD("SSD"),
    HDD("HDD");
    private final String type;
    DriveType(String type) {
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
