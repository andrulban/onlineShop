package andruha_denia.online_shop.controller.rest.user;

import core.cross_service.dto.entity.DTO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @author azozello
 * @since 05.10.17.
 */

@RestController
@RequestMapping("/test")
public class TestControllerRest {

    private static final Logger LOG = Logger.getLogger(TestControllerRest.class);

    private final String URL_DTO = "https://localhost:8043/test/unsecured/";

    @Autowired
    private RestTemplate template;

    @RequestMapping("/map")
    public Map<String, String> testMap(){
        DTO dto = template.getForObject(URL_DTO+"dto", DTO.class);
        return dto.getFields();
    }

    @RequestMapping("/dto")
    public DTO testDto(){
        DTO dto = template.getForObject(URL_DTO+"dto", DTO.class);
        try {
            LOG.info(dto.getId());
            for (Map.Entry<String, String> entry : dto.getFields().entrySet()){
                LOG.info(entry.getKey()+" : "+entry.getValue());
            }
        } catch (Exception e){
            LOG.error(e);
        }
        return dto;
    }
}
