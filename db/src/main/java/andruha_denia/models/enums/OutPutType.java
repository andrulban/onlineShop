package andruha_denia.models.enums;

/**
 * @author andrusha
 * @since 31.08.17.
 */
public enum OutPutType {
    USB("USB"),
    USB2("USB2"),
    THUNDERBOLT("THUNDERBOLT"),
    THUNDERBOLT2("THUNDERBOLT2"),
    MAGSAVE("MAGSAVE"),
    MAGSAVE2("MAGSAVE2");

    private final String type;

    OutPutType(String type) {
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
