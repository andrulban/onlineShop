package andruha_denia.services.implementations;

import andruha_denia.models.entities.Ram;
import andruha_denia.repositories.RamRepository;
import andruha_denia.services.interfaces.RamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author andrusha
 * @since 03.09.17.
 */
@Service
public class RamServiceImpl implements RamService{
    private RamRepository ramRepository;

    @Autowired
    public void setRamRepository(RamRepository ramRepository) {
        this.ramRepository = ramRepository;
    }

    @Override
    public List<Ram> getAllRam() {
        return ramRepository.findAll();
    }

    @Override
    public Ram getRam(Long id) {
        return ramRepository.findOne(id);
    }

    @Override
    public void addRam(Ram ram) {
        ramRepository.save(ram);
    }

    @Override
    public void editRam(Ram ram) {
        ramRepository.saveAndFlush(ram);
    }

    @Override
    public void deleteRam(Long id) {
        ramRepository.delete(id);
    }
}
