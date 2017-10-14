package andruha_denia.models.entities;

import andruha_denia.models.enums.ConnectionAdapterType;
import andruha_denia.models.enums.DriveType;
import andruha_denia.models.exceptions.WrongSourceDTO;
import andruha_denia.utils.DTOConvertible;
import core.cross_service.dto.entity.DTO;

import javax.persistence.*;

/**
 * @author andrusha
 * @since 31.08.17.
 */
@Entity
public class Drive implements DTOConvertible {
    @Id
    @GeneratedValue
    private long id;

    @Enumerated(EnumType.STRING)
    private DriveType driveType;

    @Column
    private int size;

    public static Drive revert(DTO sourceDTO){
        Drive result = new Drive();

        try {
            result.setId(sourceDTO.getId());
            result.setDriveType(DriveType.valueOf
                    (sourceDTO.getFields().get("driveType")));
            result.setSize(new Integer(sourceDTO.getFields().get("size")));
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
        resultDTO.addField("driveType",driveType != null ? driveType.toString() : "");
        resultDTO.addField("size",""+size);

        return resultDTO;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public DriveType getDriveType() {
        return driveType;
    }

    public void setDriveType(DriveType driveType) {
        this.driveType = driveType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
