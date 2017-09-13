package andruha_denia.services.implementations;

import andruha_denia.models.entities.Processor;
import andruha_denia.repositories.ProcessorRepository;
import andruha_denia.services.interfaces.ProcessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by andrusha on 03.09.17.
 */
@Service
public class ProcessorServiceImpl implements ProcessorService{
    private ProcessorRepository processorRepository;

    @Autowired
    public void setProcessorRepository(ProcessorRepository processorRepository) {
        this.processorRepository = processorRepository;
    }

    @Override
    public List<Processor> getAllProcessor() {
        return processorRepository.findAll();
    }

    @Override
    public Processor getProcessor(Long id) {
        return processorRepository.findOne(id);
    }

    @Override
    public void addProcessor(Processor processor) {
        processorRepository.save(processor);
    }

    @Override
    public void editProcessor(Processor processor) {
        processorRepository.saveAndFlush(processor);
    }

    @Override
    public void deleteProcessor(Long id) {
        processorRepository.delete(id);
    }
}
