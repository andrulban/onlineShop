package andruha_denia.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by andrusha on 31.08.17.
 */
@Entity
public class Processor {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String name;
    @Column
    private int coresAmount;
    @Column
    private float minHertz;
    @Column
    private float maxHertz;

    public Processor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoresAmount() {
        return coresAmount;
    }

    public void setCoresAmount(int coresAmount) {
        this.coresAmount = coresAmount;
    }

    public float getMinHertz() {
        return minHertz;
    }

    public void setMinHertz(float minHertz) {
        this.minHertz = minHertz;
    }

    public float getMaxHertz() {
        return maxHertz;
    }

    public void setMaxHertz(float maxHertz) {
        this.maxHertz = maxHertz;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
