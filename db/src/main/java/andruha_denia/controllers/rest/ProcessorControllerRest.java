package andruha_denia.controllers.rest;

import andruha_denia.models.entities.Processor;
import andruha_denia.services.interfaces.ProcessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author azozello
 * @since 17.09.17.
 */

@RestController
public class ProcessorControllerRest {
    private ProcessorService processorService;

    @RequestMapping(value = "/db/processor/getAll", method = RequestMethod.GET)
    public List<Processor> getAll() {
        return processorService.getAllProcessor();
    }

    @RequestMapping("/db/processor/get/{id}")
    public Processor get(@PathVariable long id){
        return processorService.getProcessor(id);
    }

    @RequestMapping(value = "/db/processor/add", method = RequestMethod.POST)
    public void add(@RequestBody Processor processor){
        processorService.addProcessor(processor);
    }

    @RequestMapping(value = "/db/processor/edit", method = RequestMethod.POST)
    public void edit(@RequestBody Processor processor){
        processorService.editProcessor(processor);
    }

    @RequestMapping(value = "/db/processor/delete/{id}")
    public void delete(@PathVariable long id){
        processorService.deleteProcessor(id);
    }

    @Autowired
    public void setProcessorService(ProcessorService processorService) {
        this.processorService = processorService;
    }
}
