package andruha_denia.services.interfaces;

import andruha_denia.models.entities.Processor;

import java.util.List;

/**
 * Created by andrusha on 03.09.17.
 */
public interface ProcessorService {
    List<Processor> getAllProcessor();
    Processor getProcessor(Long id);
    void addProcessor(Processor processor);
    void editProcessor(Processor processor);
    void deleteProcessor(Long id);
}
