package andruha_denia.models.entities;

import andruha_denia.models.enums.OutPutType;

import javax.persistence.*;

/**
 * @author andrusha
 * @since 31.08.17.
 */
@Entity
public class Output {
    @Id
    @GeneratedValue
    private long id;
    @Enumerated(EnumType.STRING)
    private OutPutType outPutType;

    public Output() {
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
