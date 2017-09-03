package andruha_denia.services.implementations;

import andruha_denia.models.entities.Battery;
import andruha_denia.repositories.BatterRepository;
import andruha_denia.services.interfaces.BatteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by andrusha on 03.09.17.
 */
@Service
public class BatteryServiceImpl implements BatteryService{
    private BatterRepository batterRepository;

    @Autowired
    public void setBatterRepository(BatterRepository batterRepository) {
        this.batterRepository = batterRepository;
    }

    @Override
    public List<Battery> getAllBattery() {
        return batterRepository.findAll();
    }

    @Override
    public Battery getBattery(Long id) {
        return batterRepository.findOne(id);
    }

    @Override
    public void addBattery(Battery battery) {
        batterRepository.save(battery);
    }

    @Override
    public void editBattery(Battery battery) {
        batterRepository.saveAndFlush(battery);
    }

    @Override
    public void deleteBattery(Long id) {
        batterRepository.delete(id);
    }
}
