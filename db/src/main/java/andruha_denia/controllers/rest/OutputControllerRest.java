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

    @RequestMapping(value = "/db/output/getAll", method = RequestMethod.GET)
    public List<Output> getAll() {
        return outputService.getAllOutput();
    }

    @RequestMapping("/db/output/get/{id}")
    public Output get(@PathVariable long id){
        return outputService.getOutput(id);
    }

    @RequestMapping(value = "/db/output/add", method = RequestMethod.POST)
    public void add(@RequestBody Output output){
        outputService.addOutput(output);
    }

    @RequestMapping(value = "/db/output/edit", method = RequestMethod.POST)
    public void edit(@RequestBody Output output){
        outputService.editOutput(output);
    }

    @RequestMapping(value = "/db/output/delete/{id}")
    public void delete(@PathVariable long id){
        outputService.deleteOutput(id);
    }

    @Autowired
    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }
}
