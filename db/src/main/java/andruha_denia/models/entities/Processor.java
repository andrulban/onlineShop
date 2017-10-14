package andruha_denia.models.entities;

import andruha_denia.models.enums.GpuType;
import andruha_denia.models.exceptions.WrongSourceDTO;
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

    public static Processor revert(DTO sourceDTO){
        Processor result = new Processor();

        try {
            result.setId(sourceDTO.getId());
            result.setName(sourceDTO.getFields().get("name"));
            result.setMinGHertz(new Integer(sourceDTO.getFields().get("minGHertz")));
            result.setMaxGHertz(new Integer(sourceDTO.getFields().get("maxGHertz")));
            result.setCoresAmount(new Integer(sourceDTO.getFields().get("coresAmount")));
        } catch (NullPointerException npe){
            throw new WrongSourceDTO("Required field was not found");
        } catch (NumberFormatException nfe){
            throw new WrongSourceDTO("Field 'version' has illegal value ");
        }  catch (IllegalArgumentException iae){
            throw new WrongSourceDTO("Field 'connectionAdapterType' has illegal value ");
        }

        return result;
    }

    @Override
    public DTO convert() {
        DTO resultDTO = new DTO();

        resultDTO.setId(id);
        resultDTO.addField("name",name != null ? name : "");
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
