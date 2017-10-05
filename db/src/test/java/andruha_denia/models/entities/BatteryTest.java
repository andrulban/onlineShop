package andruha_denia.models.entities;

import andruha_denia.models.enums.BatteryType;
import andruha_denia.models.enums.ConnectionAdapterType;
import andruha_denia.utils.DTOConvertible;
import core.cross_service.dto.entity.DTO;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
    public void batteryTest(){
        logger.info("Battery test started");
        Assert.assertEquals(expectedDTO,battery.convert());
        logger.info("Battery test passed");
    }
}
