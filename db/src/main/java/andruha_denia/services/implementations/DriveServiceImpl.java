package andruha_denia.services.implementations;

import andruha_denia.models.entities.Drive;
import andruha_denia.repositories.DriveRepository;
import andruha_denia.services.interfaces.DriveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by andrusha on 03.09.17.
 */
@Service
public class DriveServiceImpl implements DriveService{
    private DriveRepository driveRepository;

    @Autowired
    public void setDriveRepository(DriveRepository driveRepository) {
        this.driveRepository = driveRepository;
    }

    @Override
    public List<Drive> getAllDrive() {
        return driveRepository.findAll();
    }

    @Override
    public Drive getDrive(Long id) {
        return driveRepository.findOne(id);
    }

    @Override
    public void addDrive(Drive drive) {
        driveRepository.save(drive);
    }

    @Override
    public void editDrive(Drive drive) {
        driveRepository.save(drive);
    }

    @Override
    public void deleteDrive(Long id) {
        driveRepository.delete(id);
    }
}
