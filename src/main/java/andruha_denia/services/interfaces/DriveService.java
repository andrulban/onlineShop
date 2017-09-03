package andruha_denia.services.interfaces;

import andruha_denia.models.entities.Drive;

import java.util.List;

/**
 * Created by andrusha on 03.09.17.
 */
public interface DriveService {
    List<Drive> getAllDrive();
    Drive getDrive(Long id);
    void addDrive(Drive drive);
    void editDrive(Drive drive);
    void deleteDrive(Long id);
}
