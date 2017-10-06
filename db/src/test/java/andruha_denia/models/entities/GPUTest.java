package andruha_denia.models.entities;

import andruha_denia.models.enums.GpuType;
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
public class GPUTest {

    private static final Logger logger = Logger.getLogger(GPUTest.class);

    private DTO expectedDTO;
    private Gpu gpu;

    @Before
    public void setUp(){
        expectedDTO = new DTO();
        expectedDTO.setId(228);
        expectedDTO.addField("gpuType", GpuType.Integrated.toString());
        expectedDTO.addField("name","Ахуенная видяха");
        expectedDTO.addField("ramAmount",""+4);

        gpu = new Gpu();
        gpu.setId(228);
        gpu.setGpuType(GpuType.Integrated);
        gpu.setName("Ахуенная видяха");
        gpu.setRamAmount(4);
    }

    @Test
    public void GpuTest(){
        logger.info("Gpu test started");
        Assert.assertEquals(expectedDTO, gpu.convert());
        logger.info("Gpu test passed");
    }

    @Test
    public void GPUNullTest(){
        Gpu gpu = new Gpu();
        DTO expectedNotNullDTO = gpu.convert();

        logger.info("GPU null test started");

        for (Map.Entry<String, String> entity : expectedNotNullDTO.getFields().entrySet()){
            Assert.assertNotNull(entity.getValue());
        }

        logger.info("GPU null test passed");
    }
}
