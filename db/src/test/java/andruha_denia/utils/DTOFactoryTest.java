package andruha_denia.utils;

import andruha_denia.models.entities.Battery;
import andruha_denia.utils.interfaces.DTOConvertible;
import andruha_denia.utils.interfaces.DTOFactory;
import core.cross_service.dto.entity.DTO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author azozello
 * @since 04.10.17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class DTOFactoryTest {

    @Autowired
    private DTOFactory dtoFactory;

    private DTO expectedDTO;
    private DTOConvertible entity;

    @Before
    public void setUp(){
        expectedDTO = new DTO();
        entity = new Battery();
    }

    public void Test(){
        DTO resultDTO = dtoFactory.entityToDTO(entity);
        Assert.assertEquals(expectedDTO,resultDTO);
    }
}
