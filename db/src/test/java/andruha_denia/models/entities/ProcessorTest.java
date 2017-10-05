package andruha_denia.models.entities;

import core.cross_service.dto.entity.DTO;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author azozello
 * @since 05.10.17.
 */
public class ProcessorTest {

    private static final Logger logger = Logger.getLogger(ProcessorTest.class);

    private DTO expectedDTO;
    private Processor processor;

    @Before
    public void setUp(){
        expectedDTO = new DTO();
        expectedDTO.setId(228);
        expectedDTO.addField("coresAmount",""+4);
        expectedDTO.addField("maxGHertz",""+3.7f);
        expectedDTO.addField("minGHertz",""+2.4f);
        expectedDTO.addField("","Ахуенный проц");

        processor = new Processor();
        processor.setId(228);
        processor.setCoresAmount(4);
        processor.setMaxGHertz(3.7f);
        processor.setMinGHertz(2.4f);
        processor.setName("Ахуенный проц");
    }

    @Test
    public void processorTest(){
        logger.info("Processor test started");
        Assert.assertEquals(expectedDTO, processor.convert());
        logger.info("Processor test passed");
    }
}