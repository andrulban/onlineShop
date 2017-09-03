package andruha_denia.models.entities;

import andruha_denia.models.enums.BatteryType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by andrusha on 31.08.17.
 */
@Entity
public class Battery {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private BatteryType batteryType;
    @Column
    private String name;
    @Column
    private String description;

    public Battery() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
