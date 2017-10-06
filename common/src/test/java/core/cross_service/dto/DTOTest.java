package core.cross_service.dto;

import core.cross_service.dto.entity.DTO;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author azozello
 * @since 06.10.17.
 */
public class DTOTest {

    private static final Logger LOGGER = Logger.getLogger(DTOTest.class);

    private DTO testDTO;
    private DTO equalToTestDTO;
    private DTO notEqualToTestDTO;
    private DTO differentFieldsAmountDTO;
    private DTO nullDTO;

    @Before
    public void setUp(){
        ConsoleAppender console = new ConsoleAppender();

        String PATTERN = "%d [%p] %c  %C{1}  %m%n";
        console.setLayout(new PatternLayout(PATTERN));
        console.setThreshold(Level.INFO);
        console.activateOptions();

        LOGGER.addAppender(console);

        testDTO = new DTO();
        testDTO.setId(228);
        testDTO.addField("Field_name","Field_body");

        equalToTestDTO = new DTO();
        equalToTestDTO.setId(228);
        equalToTestDTO.addField("Field_name","Field_body");

        nullDTO = new DTO();

        notEqualToTestDTO = new DTO();
        notEqualToTestDTO.setId(229);
        notEqualToTestDTO.addField("Field_name_different","Field_body_different");

        differentFieldsAmountDTO = new DTO();
        differentFieldsAmountDTO.setId(229);
        differentFieldsAmountDTO.addField("Field_name","Field_body");
        differentFieldsAmountDTO.addField("Second_name","Second_body");
    }

    @Test
    public void equalityTest(){
        LOGGER.info("Equality test started");
        Assert.assertEquals(testDTO,equalToTestDTO);
        LOGGER.info("Equality test finished");
    }

    @Test
    public void nullTest(){
        LOGGER.info("Null test started");
        Assert.assertNotEquals(testDTO,nullDTO);
        LOGGER.info("Null test finished");
    }

    @Test
    public void notEqualityTest(){
        LOGGER.info("Not equality test started");
        Assert.assertNotEquals(testDTO,notEqualToTestDTO);
        LOGGER.info("Not equality test finished");
    }

    @Test
    public void differentFieldsAmountNotEqualsDTOTest(){
        LOGGER.info("Different fields amount not equals test started");
        Assert.assertNotEquals(testDTO,differentFieldsAmountDTO);
        LOGGER.info("Different fields amount test finished");
    }
}

