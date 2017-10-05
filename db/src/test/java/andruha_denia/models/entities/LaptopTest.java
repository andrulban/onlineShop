package andruha_denia.models.entities;

import andruha_denia.models.enums.OutPutType;
import core.cross_service.dto.entity.DTO;
import core.cross_service.dto.entity.LaptopDTO;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author azozello
 * @since 05.10.17.
 */
public class LaptopTest {

    private static final Logger logger = Logger.getLogger(LaptopTest.class);

    private DTO expectedDTO;
    private Laptop laptop;

    @Before
    public void setUp(){
        expectedDTO = new LaptopDTO();
        expectedDTO.setId(228);
        expectedDTO.addField("outPutType", OutPutType.MAGSAVE.toString());

        laptop = new Laptop();
        laptop.setId(228);
        laptop.setWidth(14);
    }

    @Test
    public void LaptopTest(){
        logger.info("Laptop test started");
        Assert.assertEquals(expectedDTO, laptop.convert());
        logger.info("Laptop test passed");
    }
}
