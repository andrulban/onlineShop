package andruha_denia.controllers.rest;

import andruha_denia.models.entities.Output;
import andruha_denia.services.interfaces.OutputService;
import core.cross_service.dto.entity.DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author azozello
 * @since 17.09.17.
 */

@RestController
public class OutputControllerRest {

    private OutputService outputService;

    @Autowired
    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }

    @GetMapping(value = "/db/outputs")
    public List<Output> getAll() {
        return outputService.getAllOutput();
    }

    @GetMapping("/db/outputs/{id}")
    public Output get(@PathVariable long id){
        return outputService.getOutput(id);
    }

    @PostMapping(value = "/db/outputs")
    public void add(@RequestBody DTO dto){
        outputService.addOutput(Output.revert(dto));
    }

    @PutMapping(value = "/db/outputs/{id}")
    public void edit(@PathVariable long id, @RequestBody DTO dto){
        dto.setId(id);
        outputService.editOutput(Output.revert(dto));
    }

    @DeleteMapping(value = "/db/outputs/{id}")
    public void delete(@PathVariable long id){
        outputService.deleteOutput(id);
    }

}
