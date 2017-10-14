package andruha_denia.models.entities;

import andruha_denia.models.enums.GpuType;
import andruha_denia.models.enums.RamType;
import andruha_denia.models.exceptions.WrongSourceDTO;
import andruha_denia.utils.DTOConvertible;
import core.cross_service.dto.entity.DTO;

import javax.persistence.*;

/**
 * @author andrusha
 * @since 31.08.17.
 */
@Entity
public class Ram implements DTOConvertible {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private int size;

    @Enumerated(EnumType.STRING)
    private RamType ramType;

    @Column
    private int megaHertz;

    public static Ram revert(DTO sourceDTO){
        Ram result = new Ram();

        try {
            result.setId(sourceDTO.getId());
            result.setRamType(RamType.valueOf
                    (sourceDTO.getFields().get("ramType")));
            result.setSize(new Integer(sourceDTO.getFields().get("size")));
            result.setMegaHertz(new Integer(sourceDTO.getFields().get("megaHertz")));
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
        resultDTO.addField("size",""+size);
        resultDTO.addField("ramType",ramType != null ? ramType.toString() : "");
        resultDTO.addField("megaHertz",""+megaHertz);

        return resultDTO;
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

    public int getMegaHertz() {
        return megaHertz;
    }

    public void setMegaHertz(int megaHertz) {
        this.megaHertz = megaHertz;
    }
}
