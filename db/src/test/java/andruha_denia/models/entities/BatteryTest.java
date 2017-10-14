package andruha_denia.models.entities;

import andruha_denia.models.enums.BatteryType;
import andruha_denia.models.exceptions.WrongSourceDTO;
import andruha_denia.utils.DTOConvertible;
import core.cross_service.dto.entity.DTO;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

/**
 * @author azozello
 * @since 04.10.17.
 */

public class BatteryTest {

    private static final Logger logger = Logger.getLogger(DTOConvertible.class);

    private DTO expectedDTO;
    private Battery battery;

    @Before
    public void setUp(){
        expectedDTO = new DTO();
        expectedDTO.setId(228);
        expectedDTO.addField("batteryType",BatteryType.PORTABLE.toString());
        expectedDTO.addField("description","Ахуенная батарейка братан, ваще аддуши");

        battery = new Battery();
        battery.setId(228);
        battery.setBatteryType(BatteryType.PORTABLE);
        battery.setDescription("Ахуенная батарейка братан, ваще аддуши");
    }

    @Test
    public void batteryEqualityTest(){
        logger.info("Battery common test started");
        Assert.assertEquals(expectedDTO, battery.convert());
        logger.info("Battery common test passed");
    }

    @Test
    public void batteryNotEqualityTest(){
        expectedDTO.setId(1448);
        logger.info("Battery common test started");
        Assert.assertNotEquals(expectedDTO, battery.convert());
        logger.info("Battery common test passed");
    }

    @Test
    public void batteryNotNullTest(){
        battery = new Battery();
        DTO expectedNotNullDTO = battery.convert();

        logger.info("Battery not null test started");

        for (Map.Entry<String, String> entity : expectedNotNullDTO.getFields().entrySet()){
            Assert.assertNotNull(entity.getValue());
        }

        logger.info("Battery not null test passed");
    }

    @Test(expected = WrongSourceDTO.class)
    public void revertExceptionTest(){
        DTO testDTO = new DTO();
        Battery.revert(testDTO);
    }

    @Test
    public void batteryNullTest(){
        battery = new Battery();
        battery.setId(228);

        DTO DTOWithNulls = battery.convert();

        logger.info("Battery null test started");

        Assert.assertEquals(DTOWithNulls, battery.convert());

        logger.info("Battery null test passed");
    }
}
