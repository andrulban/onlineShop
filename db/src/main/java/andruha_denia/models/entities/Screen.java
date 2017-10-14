package andruha_denia.models.entities;

import andruha_denia.models.enums.RamType;
import andruha_denia.models.enums.ResolutionType;
import andruha_denia.models.enums.ScreenType;
import andruha_denia.models.exceptions.WrongSourceDTO;
import andruha_denia.utils.DTOConvertible;
import core.cross_service.dto.entity.DTO;

import javax.persistence.*;

/**
 * @author andrusha
 * @since 31.08.17.
 */
@Entity
public class Screen implements DTOConvertible{
    @Id
    @GeneratedValue
    private long id;

    @Column
    private float diagonal;

    @Column
    private String resolution;

    @Enumerated(EnumType.STRING)
    private ResolutionType resolutionType;

    @Enumerated(EnumType.STRING)
    private ScreenType screenType;

    public static Screen revert(DTO sourceDTO){
        Screen result = new Screen();

        try {
            result.setId(sourceDTO.getId());
            result.setResolutionType(ResolutionType.valueOf
                    (sourceDTO.getFields().get("resolutionType")));
            result.setScreenType(ScreenType.valueOf
                    (sourceDTO.getFields().get("screenType")));
            result.setDiagonal(new Float(sourceDTO.getFields().get("diagonal")));
            result.setResolution(sourceDTO.getFields().get("resolution"));
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
        resultDTO.addField("diagonal",""+diagonal);
        resultDTO.addField("resolution", resolution != null ? resolution : "");
        resultDTO.addField("resolutionType", resolutionType != null ? resolutionType.toString() : "");
        resultDTO.addField("screenType", screenType != null ? screenType.toString() : "");

        return resultDTO;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public ResolutionType getResolutionType() {
        return resolutionType;
    }

    public void setResolutionType(ResolutionType resolutionType) {
        this.resolutionType = resolutionType;
    }

    public ScreenType getScreenType() {
        return screenType;
    }

    public void setScreenType(ScreenType screenType) {
        this.screenType = screenType;
    }
}
