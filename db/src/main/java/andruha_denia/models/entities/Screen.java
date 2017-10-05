package andruha_denia.models.entities;

import andruha_denia.models.enums.ResolutionType;
import andruha_denia.models.enums.ScreenType;
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

    @Override
    public DTO convert() {
        DTO resultDTO = new DTO();

        resultDTO.setId(id);
        resultDTO.addField("diagonal",""+diagonal);
        resultDTO.addField("resolution",resolution);
        resultDTO.addField("resolutionType",resolutionType.toString());
        resultDTO.addField("screenType",screenType.toString());

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
