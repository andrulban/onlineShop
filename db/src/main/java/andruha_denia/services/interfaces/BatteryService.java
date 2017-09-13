package andruha_denia.services.interfaces;

import andruha_denia.models.entities.Battery;

import java.util.List;

/**
 * Created by andrusha on 03.09.17.
 */
public interface BatteryService {
    List<Battery> getAllBattery();
    Battery getBattery(Long id);
    void addBattery(Battery battery);
    void editBattery(Battery battery);
    void deleteBattery(Long id);
}

//        List<"> getAll"();
//        get(Long id);
//        void add();
//        void edit();
//        void delete(Long id);