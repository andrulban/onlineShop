package andruha_denia.controllers.rest;

import andruha_denia.models.entities.Processor;
import andruha_denia.services.interfaces.ProcessorService;
import core.cross_service.dto.entity.DTO;
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

    @Autowired
    public void setProcessorService(ProcessorService processorService) {
        this.processorService = processorService;
    }

    @GetMapping(value = "/db/processors")
    public List<Processor> getAll() {
        return processorService.getAllProcessor();
    }

    @GetMapping("/db/processors/{id}")
    public Processor get(@PathVariable long id){
        return processorService.getProcessor(id);
    }

    @PostMapping(value = "/db/processors")
    public void add(@RequestBody DTO dto){
        processorService.addProcessor(Processor.revert(dto));
    }

    @PutMapping(value = "/db/processors/{id}")
    public void edit(@PathVariable long id, @RequestBody DTO dto){
        dto.setId(id);
        processorService.editProcessor(Processor.revert(dto));
    }

    @DeleteMapping(value = "/db/processors/{id}")
    public void delete(@PathVariable long id){
        processorService.deleteProcessor(id);
    }

}
