package andruha_denia.controllers.rest;

import andruha_denia.models.entities.Drive;
import andruha_denia.services.interfaces.DriveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author azozello
 * @since 17.09.17.
 */

@RestController
public class DriveControllerRest {

    private DriveService driveService;

    @Autowired
    public void setDriveService(DriveService driveService) {
        this.driveService = driveService;
    }

    @GetMapping(value = "/db/drives")
    public List<Drive> getAll() {
        return driveService.getAllDrive();
    }

    @GetMapping("/db/drives/{id}")
    public Drive get(@PathVariable long id) {
        return driveService.getDrive(id);
    }

    @PostMapping(value = "/db/drives")
    public void add(@RequestBody Drive drive) {
        driveService.addDrive(drive);
    }

    @PutMapping(value = "/db/drives/{id}")
    public void edit(@PathVariable long id, @RequestBody Drive drive) {
        drive.setId(id);
        driveService.editDrive(drive);
    }

    @DeleteMapping(value = "/db/drives/{id}")
    public void delete(@PathVariable long id) {
        driveService.deleteDrive(id);
    }

}
