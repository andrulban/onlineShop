package andruha_denia.online_shop.controller.rest.user;

import core.cross_service.dto.entity.DTO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author azozello
 * @since 09.10.17.
 */

@RestController()
public class DtoControllerRest {

    private final String URL = "https://localhost:8043/";

    private static final Logger LOG = Logger.getLogger(DtoControllerRest.class);

    @Autowired
    private RestTemplate template;

    @SuppressWarnings("unchecked")
    @GetMapping(value = "/rest/batteries/")
    public List<DTO> getAllBatteries() {
        return template.getForObject(URL+"db/batteries", List.class);
    }

    @GetMapping("/rest/batteries/{id}")
    public DTO getBattery(@PathVariable long id){
        return template.getForObject(URL+"db/batteries/"+id,DTO.class);
    }

    @SuppressWarnings("unchecked")
    @GetMapping(value = "/rest/connection_adapters/")
    public List<DTO> getAllCA() {
        return template.getForObject(URL+"db/connection_adapters", List.class);
    }

    @GetMapping("/rest/connection_adapters/{id}")
    public DTO getCA(@PathVariable long id){
        return template.getForObject(URL+"db/connection_adapters/"+id,DTO.class);
    }

    @SuppressWarnings("unchecked")
    @GetMapping(value = "/rest/drives/")
    public List<DTO> getAllDrivers() {
        return template.getForObject(URL+"db/drives", List.class);
    }

    @GetMapping("/rest/drives/{id}")
    public DTO getDrive(@PathVariable long id){
        return template.getForObject(URL+"db/drives/"+id,DTO.class);
    }

    @SuppressWarnings("unchecked")
    @GetMapping(value = "/rest/gpus/")
    public List<DTO> getAllGPU() {
        return template.getForObject(URL+"db/gpus", List.class);
    }

    @GetMapping("/rest/gpus/{id}")
    public DTO getGPU(@PathVariable long id){
        return template.getForObject(URL+"db/gpus/"+id,DTO.class);
    }

    @SuppressWarnings("unchecked")
    @GetMapping(value = "/rest/outputs/")
    public List<DTO> getAllOutputs() {
        return template.getForObject(URL+"db/outputs", List.class);
    }

    @GetMapping("/rest/outputs/{id}")
    public DTO getOutput(@PathVariable long id){
        return template.getForObject(URL+"db/outputs/"+id,DTO.class);
    }

    @SuppressWarnings("unchecked")
    @GetMapping(value = "/rest/processors/")
    public List<DTO> getAllProcessors() {
        return template.getForObject(URL+"db/processors", List.class);
    }

    @GetMapping("/rest/processors/{id}")
    public DTO getProcessor(@PathVariable long id){
        return template.getForObject(URL+"db/processors/"+id,DTO.class);
    }

    @SuppressWarnings("unchecked")
    @GetMapping(value = "/rest/rams/")
    public List<DTO> getAllRAM() {
        return template.getForObject(URL+"db/rams", List.class);
    }

    @GetMapping("/rest/rams/{id}")
    public DTO getRAM(@PathVariable long id){
        return template.getForObject(URL+"db/rams/"+id,DTO.class);
    }

    @SuppressWarnings("unchecked")
    @GetMapping(value = "/rest/screens/")
    public List<DTO> getAllScreens() {
        return template.getForObject(URL+"db/screens", List.class);
    }

    @GetMapping("/rest/screens/{id}")
    public DTO getScreen(@PathVariable long id){
        return template.getForObject(URL+"db/screens/"+id,DTO.class);
    }

}
