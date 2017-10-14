package andruha_denia.models.entities;

import andruha_denia.models.enums.ConnectionAdapterType;
import andruha_denia.models.exceptions.WrongSourceDTO;
import andruha_denia.utils.DTOConvertible;
import core.cross_service.dto.entity.DTO;

import javax.persistence.*;

/**
 * @author andrusha
 * @since 31.08.17.
 */
@Entity
public class ConnectionAdapter implements DTOConvertible{
    @Id
    @GeneratedValue
    private long id;

    @Enumerated(EnumType.STRING)
    private ConnectionAdapterType connectionAdapterType;

    @Column
    private float version;

    public static ConnectionAdapter revert(DTO sourceDTO){
        ConnectionAdapter result = new ConnectionAdapter();

        try {
            result.setId(sourceDTO.getId());
            result.setConnectionAdapterType(ConnectionAdapterType.valueOf
                    (sourceDTO.getFields().get("connectionAdapterType")));
            result.setVersion(new Float(sourceDTO.getFields().get("version")));
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
        resultDTO.addField("connectionAdapterType", connectionAdapterType != null ? connectionAdapterType.toString() : "");
        resultDTO.addField("version",""+version);

        return resultDTO;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ConnectionAdapterType getConnectionAdapterType() {
        return connectionAdapterType;
    }

    public void setConnectionAdapterType(ConnectionAdapterType connectionAdapterType) {
        this.connectionAdapterType = connectionAdapterType;
    }

    public float getVersion() {
        return version;
    }

    public void setVersion(float version) {
        this.version = version;
    }
}
