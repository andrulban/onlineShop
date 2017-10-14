package andruha_denia.models.entities;

import andruha_denia.models.enums.ConnectionAdapterType;
import andruha_denia.models.exceptions.WrongSourceDTO;
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
    public void ConnectionAdapterEqualityTest(){
        DTO dto = new DTO();
        dto.setId(228);
        dto.addField("connectionAdapterType","WIFI");
        dto.addField("version","1.0");

        ConnectionAdapter CASource = new ConnectionAdapter();
        CASource.setId(228);
        CASource.setVersion(1.0f);
        CASource.setConnectionAdapterType(ConnectionAdapterType.WIFI);

        ConnectionAdapter CAResult = ConnectionAdapter.revert(dto);

        Assert.assertEquals(CASource.getId(),CAResult.getId());
        Assert.assertEquals(CASource.getConnectionAdapterType(),CAResult.getConnectionAdapterType());
    }

    @Test(expected = WrongSourceDTO.class)
    public void ConnectionAdapterNullTest(){
        DTO dto = new DTO();
        ConnectionAdapter.revert(dto);
    }

    @Test(expected = WrongSourceDTO.class)
    public void ConnectionAdapterTypeTest(){
        DTO dto = new DTO();
        dto.addField("connectionAdapterType","s");
        ConnectionAdapter.revert(dto);
    }

    @Test(expected = WrongSourceDTO.class)
    public void ConnectionAdapterVersionTest(){
        DTO dto = new DTO();
        dto.addField("connectionAdapterType","WIFI");
        dto.addField("version","sd");
        ConnectionAdapter.revert(dto);
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