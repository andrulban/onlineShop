package andruha_denia.models.entities;

import andruha_denia.models.enums.GpuType;

import javax.persistence.*;

/**
 * Created by andrusha on 31.08.17.
 */
@Entity
public class Gpu {
    @Id
    @GeneratedValue
    private long id;
    @Enumerated(EnumType.STRING)
    private GpuType gpuType;
    @Column
    private String name;
    @Column
    private int ramAmount;

    public Gpu() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public GpuType getGpuType() {
        return gpuType;
    }

    public void setGpuType(GpuType gpuType) {
        this.gpuType = gpuType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRamAmount() {
        return ramAmount;
    }

    public void setRamAmount(int ramAmount) {
        this.ramAmount = ramAmount;
    }
}
