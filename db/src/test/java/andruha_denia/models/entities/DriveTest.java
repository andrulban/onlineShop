package andruha_denia.models.entities;

import andruha_denia.models.enums.DriveType;
import core.cross_service.dto.entity.DTO;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author azozello
 * @since 05.10.17.
 */
public class DriveTest {

    private static final Logger logger = Logger.getLogger(DriveTest.class);

    private DTO expectedDTO;
    private Drive drive;

    @Before
    public void setUp(){
        expectedDTO = new DTO();
        expectedDTO.setId(228);
        expectedDTO.addField("driveType", DriveType.HDD.toString());
        expectedDTO.addField("size",""+322);

        drive = new Drive();
        drive.setId(228);
        drive.setDriveType(DriveType.HDD);
        drive.setSize(322);
    }

    @Test
    public void DriveTest(){
        logger.info("Drive test started");
        Assert.assertEquals(expectedDTO, drive.convert());
        logger.info("Drive test passed");
    }
}
