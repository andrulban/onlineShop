package andruha_denia.models.entities;

import andruha_denia.models.enums.BatteryType;
import andruha_denia.utils.DTOConvertible;
import core.cross_service.dto.entity.DTO;

import javax.persistence.*;

/**
 * @author andrusha
 * @since 31.08.17.
 */
@Entity
public class Battery implements DTOConvertible {
    @Id
    @GeneratedValue
    private long id;

    @Enumerated(EnumType.STRING)
    private BatteryType batteryType;

    @Column
    private String description;

    @Override
    public DTO convert() {
        DTO resultDTO = new DTO();

        resultDTO.setId(id);
        resultDTO.addField("batteryType", batteryType != null ? batteryType.toString() : "");
        resultDTO.addField("description", description != null ? description : "");

        return resultDTO;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BatteryType getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(BatteryType batteryType) {
        this.batteryType = batteryType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
