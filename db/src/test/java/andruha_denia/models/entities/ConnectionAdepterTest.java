package andruha_denia.models.entities;

import andruha_denia.models.enums.BatteryType;
import andruha_denia.models.enums.ConnectionAdapterType;
import andruha_denia.utils.DTOConvertible;
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
public class ConnectionAdepterTest {

    private static final Logger logger = Logger.getLogger(ConnectionAdepterTest.class);

    private DTO expectedDTO;
    private ConnectionAdapter connectionAdapter;

    @Before
    public void setUp(){
        expectedDTO = new DTO();
        expectedDTO.setId(228);
        expectedDTO.addField("connectionAdapterType", ConnectionAdapterType.WIFI.toString());
        expectedDTO.addField("version",""+14.88f);

        connectionAdapter = new ConnectionAdapter();
        connectionAdapter.setId(228);
        connectionAdapter.setConnectionAdapterType(ConnectionAdapterType.WIFI);
        connectionAdapter.setVersion(14.88f);
    }

    @Test
    public void ConnectionAdapterCommonTest(){
        logger.info("ConnectionAdapter test started");
        Assert.assertEquals(expectedDTO, connectionAdapter.convert());
        logger.info("ConnectionAdapter test passed");
    }

    @Test
    public void connectionAdapterNotEqualityTest(){
        expectedDTO.addField("NotCaField","Something not important");
        logger.info("ConnectionAdapter common test started");
        Assert.assertNotEquals(expectedDTO, connectionAdapter.convert());
        logger.info("ConnectionAdapter common test passed");
    }

    @Test
    public void connectionAdapterNotNullTest(){
        connectionAdapter = new ConnectionAdapter();
        DTO expectedNotNullDTO = connectionAdapter.convert();

        logger.info("ConnectionAdapter not null test started");

        for (Map.Entry<String, String> entity : expectedNotNullDTO.getFields().entrySet()){
            Assert.assertNotNull(entity.getValue());
        }

        logger.info("ConnectionAdapter not null test passed");
    }

    @Test
    public void connectionAdapterNullTest(){
        connectionAdapter = new ConnectionAdapter();
        connectionAdapter.setId(228);

        DTO DTOWithNulls = connectionAdapter.convert();

        logger.info("ConnectionAdapter null test started");

        Assert.assertEquals(DTOWithNulls, connectionAdapter.convert());

        logger.info("ConnectionAdapter null test passed");
    }
}