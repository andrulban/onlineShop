package andruha_denia.services.interfaces;

import andruha_denia.models.entities.Ram;

import java.util.List;

/**
 * Created by andrusha on 03.09.17.
 */
public interface RamService {
    List<Ram> getAllRam();
    Ram getRam(Long id);
    void addRam(Ram ram);
    void editRam(Ram ram);
    void deleteRam(Long id);
}
