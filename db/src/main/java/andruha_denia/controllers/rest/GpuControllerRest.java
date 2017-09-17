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

    @RequestMapping(value = "/db/gpu/getAll", method = RequestMethod.GET)
    public List<Gpu> getAll() {
        return gpuService.getAllGpu();
    }

    @RequestMapping("/db/gpu/get/{id}")
    public Gpu get(@PathVariable long id){
        return gpuService.getGpu(id);
    }

    @RequestMapping(value = "/db/gpu/add", method = RequestMethod.POST)
    public void add(@RequestBody Gpu gpu){
        gpuService.addGpu(gpu);
    }

    @RequestMapping(value = "/db/gpu/edit", method = RequestMethod.POST)
    public void edit(@RequestBody Gpu gpu){
        gpuService.editGpu(gpu);
    }

    @RequestMapping(value = "/db/gpu/delete/{id}")
    public void delete(@PathVariable long id){
        gpuService.deleteGpu(id);
    }

    @Autowired
    public void setGpuService(GpuService gpuService) {
        this.gpuService = gpuService;
    }
}
