package andruha_denia.models.entities;

import andruha_denia.models.enums.RamType;
import core.cross_service.dto.entity.DTO;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author azozello
 * @since 05.10.17.
 */
public class RamTest {

    private static final Logger logger = Logger.getLogger(RamTest.class);

    private DTO expectedDTO;
    private Ram ram;

    @Before
    public void setUp(){
        expectedDTO = new DTO();
        expectedDTO.setId(228);
        expectedDTO.addField("ramType",RamType.LPDDR3.toString());
        expectedDTO.addField("megaHertz",""+3);
        expectedDTO.addField("size",""+4028);

        ram = new Ram();
        ram.setId(228);
        ram.setRamType(RamType.LPDDR3);
        ram.setMegaHertz(3);
        ram.setSize(4028);
    }

    @Test
    public void ramTest(){
        logger.info("Ram test started");
        Assert.assertEquals(expectedDTO, ram.convert());
        logger.info("Ram test passed");
    }
}
