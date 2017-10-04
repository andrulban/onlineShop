package andruha_denia.services.interfaces;

import andruha_denia.models.entities.Battery;

import java.util.List;

/**
 * @author andrusha
 * @since 03.09.17.
 */
public interface BatteryService {
    List<Battery> getAllBattery();
    Battery getBattery(Long id);
    void addBattery(Battery battery);
    void editBattery(Battery battery);
    void deleteBattery(Long id);
}
