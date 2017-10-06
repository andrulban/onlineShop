package andruha_denia.controllers.rest;

import andruha_denia.models.entities.Gpu;
import andruha_denia.services.interfaces.GpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author azozello
 * @since 17.09.17.
 */

@RestController
public class GpuControllerRest {

    private GpuService gpuService;

    @Autowired
    public void setGpuService(GpuService gpuService) {
        this.gpuService = gpuService;
    }

    @GetMapping(value = "/db/gpus")
    public List<Gpu> getAll() {
        return gpuService.getAllGpu();
    }

    @GetMapping("/db/gpus/{id}")
    public Gpu get(@PathVariable long id){
        return gpuService.getGpu(id);
    }

    @PostMapping(value = "/db/gpus")
    public void add(@RequestBody Gpu gpu){
        gpuService.addGpu(gpu);
    }

    @PutMapping(value = "/db/gpus/{id}")
    public void edit(@PathVariable long id, @RequestBody Gpu gpu){
        gpu.setId(id);
        gpuService.editGpu(gpu);
    }

    @DeleteMapping(value = "/db/gpus/{id}")
    public void delete(@PathVariable long id){
        gpuService.deleteGpu(id);
    }

    }
