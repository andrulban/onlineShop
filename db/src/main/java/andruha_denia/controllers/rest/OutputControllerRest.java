package andruha_denia.controllers.rest;

import andruha_denia.models.entities.Output;
import andruha_denia.services.interfaces.OutputService;
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
    public void add(@RequestBody Output output){
        outputService.addOutput(output);
    }

    @PutMapping(value = "/db/outputs/{id}")
    public void edit(@PathVariable long id, @RequestBody Output output){
        output.setId(id);
        outputService.editOutput(output);
    }

    @DeleteMapping(value = "/db/outputs/{id}")
    public void delete(@PathVariable long id){
        outputService.deleteOutput(id);
    }

}
