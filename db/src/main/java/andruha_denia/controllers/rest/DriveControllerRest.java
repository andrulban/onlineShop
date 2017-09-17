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

    @RequestMapping(value = "/db/drive/getAll", method = RequestMethod.GET)
    public List<Drive> getAll() {
        return driveService.getAllDrive();
    }

    @RequestMapping("/db/drive/get/{id}")
    public Drive get(@PathVariable long id){
        return driveService.getDrive(id);
    }

    @RequestMapping(value = "/db/drive/add", method = RequestMethod.POST)
    public void add(@RequestBody Drive drive){
        driveService.addDrive(drive);
    }

    @RequestMapping(value = "/db/drive/edit", method = RequestMethod.POST)
    public void edit(@RequestBody Drive drive){
        driveService.editDrive(drive);
    }

    @RequestMapping(value = "/db/drive/delete/{id}")
    public void delete(@PathVariable long id){
        driveService.deleteDrive(id);
    }

    @Autowired
    public void setDriveService(DriveService driveService) {
        this.driveService = driveService;
    }
}
