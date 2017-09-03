package andruha_denia.services.implementations;

import andruha_denia.models.entities.Output;
import andruha_denia.repositories.OutputRepository;
import andruha_denia.services.interfaces.OutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by andrusha on 03.09.17.
 */
@Service
public class OutputServiceImpl implements OutputService{
    private OutputRepository outputRepository;

    @Autowired
    public void setOutputRepository(OutputRepository outputRepository) {
        this.outputRepository = outputRepository;
    }

    @Override
    public List<Output> getAllOutput() {
        return outputRepository.findAll();
    }

    @Override
    public Output getOutput(Long id) {
        return outputRepository.findOne(id);
    }

    @Override
    public void addOutput(Output output) {
        outputRepository.save(output);
    }

    @Override
    public void editOutput(Output output) {
        outputRepository.saveAndFlush(output);
    }

    @Override
    public void deleteOutput(Long id) {
        outputRepository.delete(id);
    }
}
