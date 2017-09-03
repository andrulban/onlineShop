package andruha_denia.services.interfaces;

import andruha_denia.models.entities.Output;

import java.util.List;

/**
 * Created by andrusha on 03.09.17.
 */
public interface OutputService {
    List<Output> getAllOutput();
    Output getOutput(Long id);
    void addOutput(Output output);
    void editOutput(Output output);
    void deleteOutput(Long id);
}
