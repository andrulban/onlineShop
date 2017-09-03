package andruha_denia.models.entities;

import andruha_denia.models.enums.RamType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by andrusha on 31.08.17.
 */
@Entity
public class Ram {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private int size;
    @Column
    private RamType ramType;
    @Column
    private int hertz;

    public Ram() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public RamType getRamType() {
        return ramType;
    }

    public void setRamType(RamType ramType) {
        this.ramType = ramType;
    }

    public int getHertz() {
        return hertz;
    }

    public void setHertz(int hertz) {
        this.hertz = hertz;
    }
}
