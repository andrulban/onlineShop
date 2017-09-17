package andruha_denia.controllers.rest;

import andruha_denia.models.entities.Ram;
import andruha_denia.services.interfaces.RamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author azozello
 * @since 17.09.17.
 */

@RestController
public class RamControllerRest {
    private RamService ramService;

    @RequestMapping(value = "/db/ram/getAll", method = RequestMethod.GET)
    public List<Ram> getAll() {
        return ramService.getAllRam();
    }

    @RequestMapping("/db/ram/get/{id}")
    public Ram get(@PathVariable long id){
        return ramService.getRam(id);
    }

    @RequestMapping(value = "/db/ram/add", method = RequestMethod.POST)
    public void add(@RequestBody Ram ram){
        ramService.addRam(ram);
    }

    @RequestMapping(value = "/db/ram/edit", method = RequestMethod.POST)
    public void edit(@RequestBody Ram ram){
        ramService.editRam(ram);
    }

    @RequestMapping(value = "/db/ram/delete/{id}")
    public void delete(@PathVariable long id){
        ramService.deleteRam(id);
    }

    @Autowired
    public void setRamService(RamService ramService) {
        this.ramService = ramService;
    }
}
