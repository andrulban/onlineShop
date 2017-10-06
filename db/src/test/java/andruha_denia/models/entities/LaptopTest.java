package andruha_denia.models.entities;

import andruha_denia.models.enums.Colour;
import core.cross_service.dto.entity.LaptopDTO;
import org.apache.log4j.Level;
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

    private LaptopDTO expectedDTO;
    private Laptop laptop;

    @Before
    public void setUp(){
        logger.setLevel(Level.DEBUG);

        expectedDTO = new LaptopDTO();

        expectedDTO.setId(228);
        expectedDTO.setWidth(1);
        expectedDTO.addField("advancedInfo","1");
        expectedDTO.addField("colour", Colour.ALUMINIUM.toString());

        laptop = new Laptop();

        laptop.setId(228);
        laptop.setWidth(1);
        laptop.setAdvancedInfo("1");
        laptop.setColour(Colour.ALUMINIUM);
    }

    @Test
    public void LaptopCommonTest(){
        logger.info("Laptop test started");

        /**
         * Uses for debug.
         * @bug: After changing logging level to Level.Info messages with Level.Debug are still logging.
         * TODO: Fix the bug.
         */
        printLaptopValues();

        Assert.assertEquals(expectedDTO, laptop.convert());
        logger.info("Laptop test passed");
    }

    /**
     * Logs laptop values. Uses debug level.
     */
    private void printLaptopValues(){
        logger.debug("Laptop Id:               "+laptop.getId());
        logger.debug("Laptop Height:           "+laptop.getHeight());
        logger.debug("Laptop Color:            "+laptop.getColour());
        logger.debug("Laptop AdvancedInfo:     "+laptop.getAdvancedInfo());
        logger.debug("Laptop Battery:          "+laptop.getBattery());
        logger.debug("Laptop CA:               "+laptop.getConnectionAdapter());
        logger.debug("Laptop Drive:            "+laptop.getDrive());
        logger.debug("Laptop Gpu:              "+laptop.getGpu());
        logger.debug("Laptop GranteeMonth:     "+laptop.getGranteeMonth());
        logger.debug("Laptop Kit:              "+laptop.getKit());
        logger.debug("Laptop Length:           "+laptop.getLength());
        logger.debug("Laptop Manufacturer:     "+laptop.getManufacturer());
        logger.debug("Laptop Name:             "+laptop.getName());
        logger.debug("Laptop OS:               "+laptop.getOs());
        logger.debug("Laptop Outputs:          "+laptop.getOutputs());
        logger.debug("Laptop Processor:        "+laptop.getProcessor());
        logger.debug("Laptop Ram:              "+laptop.getRam());
        logger.debug("Laptop Ram slotsAmount:  "+laptop.getRamSlotsAmount());
        logger.debug("Laptop Screen:           "+laptop.getScreen());
        logger.debug("Laptop Weight:           "+laptop.getWeight());
        logger.debug("Laptop Width:            "+laptop.getWidth());
    }
}
