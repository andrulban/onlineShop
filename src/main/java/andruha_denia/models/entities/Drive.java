package andruha_denia.models.entities;

import andruha_denia.models.enums.DriveType;

import javax.persistence.*;

/**
 * Created by andrusha on 31.08.17.
 */
@Entity
public class Drive {
    @Id
    @GeneratedValue
    private long id;
    @Enumerated(EnumType.STRING)
    private DriveType driveType;
    @Column
    private int size;

    public Drive() {
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
