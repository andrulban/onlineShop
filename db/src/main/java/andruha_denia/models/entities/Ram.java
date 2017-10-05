package andruha_denia.models.entities;

import andruha_denia.models.enums.RamType;
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

    @Override
    public DTO convert() {
        DTO resultDTO = new DTO();

        resultDTO.setId(id);
        resultDTO.addField("size",""+size);
        resultDTO.addField("ramType",ramType.toString());
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
