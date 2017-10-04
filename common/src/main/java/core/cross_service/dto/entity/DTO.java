package core.cross_service.dto.entity;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author azozello
 * @since 04.10.17.
 */
public class DTO {
    private long id;
    private Map<String, String> fields;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Map<String, String> getFields() {
        return fields;
    }

    public void setFields(Map<String, String> fields) {
        this.fields = fields;
    }

    public void addField(String name, String value){
        fields.put(name, value);
    }

    @Override
    public int hashCode() {
        return fields.size();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!DTO.class.isAssignableFrom(o.getClass())) {
            return false;
        }
        final DTO anotherDTO = (DTO) o;
        Set<String> thisValues = new HashSet<>(fields.values());
        Set<String> anotherValues = new HashSet<>(anotherDTO.getFields().values());
        return thisValues.equals(anotherValues);
    }
}
