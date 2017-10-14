package andruha_denia.models.entities;

import andruha_denia.models.enums.DriveType;
import andruha_denia.models.enums.GpuType;
import andruha_denia.models.exceptions.WrongSourceDTO;
import andruha_denia.utils.DTOConvertible;
import core.cross_service.dto.entity.DTO;

import javax.persistence.*;

/**
 * @author andrusha
 * @since 31.08.17.
 */
@Entity
public class Gpu implements DTOConvertible {
    @Id
    @GeneratedValue
    private long id;

    @Enumerated(EnumType.STRING)
    private GpuType gpuType;

    @Column
    private String name;

    @Column
    private int ramAmount;

    public static Gpu revert(DTO sourceDTO){
        Gpu result = new Gpu();

        try {
            result.setId(sourceDTO.getId());
            result.setName(sourceDTO.getFields().get("name"));
            result.setGpuType(GpuType.valueOf
                    (sourceDTO.getFields().get("gpuType")));
            result.setRamAmount(new Integer(sourceDTO.getFields().get("ramAmount")));
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
        resultDTO.addField("gpuType",gpuType != null ? gpuType.toString() : "");
        resultDTO.addField("name",name != null ? name : "");
        resultDTO.addField("ramAmount",""+ramAmount);

        return resultDTO;
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
