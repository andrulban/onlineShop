package andruha_denia.online_shop.controller.rest.admin;

import core.cross_service.dto.entity.DTO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author azozello
 * @since 09.10.17.
 */
@RestController
public class ProcessorAdminController {

    private final String URL = "https://localhost:8043/";

    private static final Logger LOG = Logger.getLogger(BatteryAdminController.class);

    @Autowired
    private RestTemplate template;

    @PostMapping(value = "/admin/processors")
    public void add(@RequestBody DTO dto){
        template.postForLocation(URL+"db/processors/add", dto);
        LOG.info("New battery added");
    }

    @PutMapping(value = "/admin/processors/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void edit(@PathVariable long id, @RequestBody DTO dto){
        template.put(URL+"db/processors/"+id, dto);
        LOG.info("Battery = "+id+" edited");
    }

    @DeleteMapping(value = "/admin/processors/{id}")
    public void delete(@PathVariable long id){
        template.delete(URL+"db/processors/"+id);
        LOG.info("Battery = "+id+" deleted");
    }
}
