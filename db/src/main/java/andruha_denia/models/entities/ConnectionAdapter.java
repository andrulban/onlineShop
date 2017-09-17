package andruha_denia.models.entities;

import andruha_denia.models.enums.ConnectionAdapterType;

import javax.persistence.*;

/**
 * @author andrusha
 * @since 31.08.17.
 */
@Entity
public class ConnectionAdapter {
    @Id
    @GeneratedValue
    private long id;

    @Enumerated(EnumType.STRING)
    private ConnectionAdapterType connectionAdapterType;
    @Column
    private float version;

    public ConnectionAdapter() {
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
