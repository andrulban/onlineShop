package andruha_denia.models.entities;

import andruha_denia.models.enums.ConnectionAdapterType;
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

    @Override
    public DTO convert() {
        DTO resultDTO = new DTO();

        resultDTO.setId(id);
        resultDTO.addField("connectionAdapterType",connectionAdapterType.toString());
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
