package andruha_denia.models.entities;

import andruha_denia.models.enums.ResolutionType;
import andruha_denia.models.enums.ScreenType;
import core.cross_service.dto.entity.DTO;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author azozello
 * @since 05.10.17.
 */
public class ScreenTest {

    private static final Logger logger = Logger.getLogger(ScreenTest.class);

    private DTO expectedDTO;
    private Screen screen;

    @Before
    public void setUp(){
        expectedDTO = new DTO();
        expectedDTO.setId(228);
        expectedDTO.addField("diagonal",""+14.88f);
        expectedDTO.addField("resolution","Резоль");
        expectedDTO.addField("resolutionType", ResolutionType.Wgxa.toString());
        expectedDTO.addField("screenType", ScreenType.GLOSSY.toString());

        screen = new Screen();
        screen.setId(228);
        screen.setDiagonal(14.88f);
        screen.setResolution("Резоль");
        screen.setResolutionType(ResolutionType.Wgxa);
        screen.setScreenType(ScreenType.GLOSSY);
    }

    @Test
    public void screenTest(){
        logger.info("Screen test started");
        Assert.assertEquals(expectedDTO, screen.convert());
        logger.info("Screen test passed");
    }
}