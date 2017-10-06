package andruha_denia.models.entities;

import andruha_denia.models.enums.OutPutType;
import core.cross_service.dto.entity.DTO;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

/**
 * @author azozello
 * @since 05.10.17.
 */
public class OutputTest {

    private static final Logger logger = Logger.getLogger(OutputTest.class);

    private DTO expectedDTO;
    private Output output;

    @Before
    public void setUp(){
        expectedDTO = new DTO();
        expectedDTO.setId(228);
        expectedDTO.addField("outPutType", OutPutType.MAGSAVE.toString());

        output = new Output();
        output.setId(228);
        output.setOutPutType(OutPutType.MAGSAVE);
    }

    @Test
    public void outPutTest(){
        logger.info("OutPut test started");
        Assert.assertEquals(expectedDTO, output.convert());
        logger.info("OutPut test passed");
    }

    @Test
    public void OutputNullTest(){
        Output output = new Output();
        DTO expectedNotNullDTO = output.convert();

        logger.info("Output null test started");

        for (Map.Entry<String, String> entity : expectedNotNullDTO.getFields().entrySet()){
            Assert.assertNotNull(entity.getValue());
        }

        logger.info("Output null test passed");
    }
}
