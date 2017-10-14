package andruha_denia.controllers.rest;

import andruha_denia.models.entities.Ram;
import andruha_denia.services.interfaces.RamService;
import core.cross_service.dto.entity.DTO;
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

    @Autowired
    public void setRamService(RamService ramService) {
        this.ramService = ramService;
    }

    @GetMapping(value = "/db/rams")
    public List<Ram> getAll() {
        return ramService.getAllRam();
    }

    @GetMapping("/db/rams/{id}")
    public Ram get(@PathVariable long id){
        return ramService.getRam(id);
    }

    @PostMapping(value = "/db/rams")
    public void add(@RequestBody DTO dto){
        ramService.addRam(Ram.revert(dto));
    }

    @PutMapping(value = "/db/rams/{id}")
    public void edit(@PathVariable long id, @RequestBody DTO dto){
        dto.setId(id);
        ramService.editRam(Ram.revert(dto));
    }

    @DeleteMapping(value = "/db/rams/{id}")
    public void delete(@PathVariable long id){
        ramService.deleteRam(id);
    }

}
