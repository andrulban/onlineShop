package andruha_denia.controllers.rest;

import andruha_denia.models.entities.Battery;
import andruha_denia.models.entities.Laptop;
import andruha_denia.models.enums.BatteryType;
import core.cross_service.dto.entity.DTO;
import core.cross_service.dto.entity.LaptopDTO;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author azozello
 * @since 17.09.17.
 */

@RestController
@RequestMapping("/test")
public class TestControllerRest {
    private static final Logger LOG = Logger.getLogger(TestControllerRest.class);

    @RequestMapping("/unsecured/uns")
    public String error(@RequestHeader("Authorization") String header) {
        return header;
    }

    @RequestMapping("/secured")
    public String testData(@RequestHeader("Authorization") String header){
        try {
            System.out.println(header);
        } catch (Exception e){
            e.printStackTrace();
        }
        return "Some important information: ";
    }

    @RequestMapping("/unsecured/laptop")
    public LaptopDTO LaptopTest(){
        Laptop laptop = new Laptop();

        laptop.setId(228);

        LaptopDTO result = (LaptopDTO) laptop.convert();

        LOG.info(result.getId());
        for (Map.Entry<String, String> entry : result.getFields().entrySet()){
            LOG.info(entry.getKey()+" : "+entry.getValue());
        }

        return result;
    }

    @RequestMapping("/unsecured/dto")
    public DTO DTOTest(){
        Battery battery = new Battery();

        battery.setId(228);
        battery.setDescription("Ахуенная батарея");
        battery.setBatteryType(BatteryType.PORTABLE);

        DTO result = battery.convert();

        LOG.info(result.getId());
        for (Map.Entry<String, String> entry : result.getFields().entrySet()){
            LOG.info(entry.getKey()+" : "+entry.getValue());
        }

        return result;
    }
}
