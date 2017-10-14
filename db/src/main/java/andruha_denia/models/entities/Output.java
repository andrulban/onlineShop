package andruha_denia.models.entities;

import andruha_denia.models.enums.GpuType;
import andruha_denia.models.enums.OutPutType;
import andruha_denia.models.exceptions.WrongSourceDTO;
import andruha_denia.utils.DTOConvertible;
import core.cross_service.dto.entity.DTO;

import javax.persistence.*;

/**
 * @author andrusha
 * @since 31.08.17.
 */
@Entity
public class Output implements DTOConvertible{
    @Id
    @GeneratedValue
    private long id;

    @Enumerated(EnumType.STRING)
    private OutPutType outPutType;

    public static Output revert(DTO sourceDTO){
        Output result = new Output();

        try {
            result.setId(sourceDTO.getId());
            result.setOutPutType(OutPutType.valueOf
                    (sourceDTO.getFields().get("outPutType")));
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
        resultDTO.addField("outPutType",outPutType != null ? outPutType.toString() : "");

        return resultDTO;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public OutPutType getOutPutType() {
        return outPutType;
    }

    public void setOutPutType(OutPutType outPutType) {
        this.outPutType = outPutType;
    }
}
