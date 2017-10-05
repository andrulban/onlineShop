package andruha_denia.models.entities;

import andruha_denia.utils.DTOConvertible;
import core.cross_service.dto.entity.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author andrusha
 * @since 31.08.17.
 */
@Entity
public class Processor implements DTOConvertible {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @Column
    private int coresAmount;

    @Column(name = "min_g_hertz")
    private float minGHertz;

    @Column(name = "max_g_hertz")
    private float maxGHertz;

    @Override
    public DTO convert() {
        DTO resultDTO = new DTO();

        resultDTO.setId(id);
        resultDTO.addField("name",name);
        resultDTO.addField("coresAmount",""+coresAmount);
        resultDTO.addField("minGHertz",""+minGHertz);
        resultDTO.addField("maxGHertz",""+maxGHertz);

        return resultDTO;
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

    public float getMinGHertz() {
        return minGHertz;
    }

    public void setMinGHertz(float minGHertz) {
        this.minGHertz = minGHertz;
    }

    public float getMaxGHertz() {
        return maxGHertz;
    }

    public void setMaxGHertz(float maxGHertz) {
        this.maxGHertz = maxGHertz;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
