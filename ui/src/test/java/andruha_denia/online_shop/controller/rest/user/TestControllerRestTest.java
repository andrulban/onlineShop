package andruha_denia.online_shop.controller.rest.user;

import core.cross_service.dto.entity.DTO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @author  azozello
 * @since 14.10.17.
 */

@RunWith(SpringRunner.class)
@WebMvcTest(TestControllerRest.class)
public class TestControllerRestTest {

    private final String URL = "https://localhost:8043/test/unsecured/dto";

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mvc;

    @MockBean
    private RestTemplate template;

    @Before
    public void setUp(){
        DTO mockDTO = new DTO();
        mockDTO.setId(228);
        mockDTO.addField("batteryType","PORTABLE");
        mockDTO.addField("description","Mocked DTO");

        Mockito.when(template.getForObject(URL, DTO.class)).thenReturn(mockDTO);

        mvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void restTemplateTest(){
        DTO expectedDTO = new DTO();
        expectedDTO.setId(228);
        expectedDTO.addField("batteryType","PORTABLE");
        expectedDTO.addField("description","Mocked DTO");

        DTO actualDTO = template.getForObject(URL, DTO.class);

        Assert.assertEquals(expectedDTO, actualDTO);
    }

    @Test
    public void testDto_thenReturnJsonDTO() throws Exception {
        int dtoID = 228;
        String batteryType = "PORTABLE";

        mvc.perform(get("/test/dto")
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", notNullValue()))
                .andExpect(jsonPath("$.id", is(dtoID)))
                .andExpect(jsonPath("$.fields.batteryType", is(batteryType)));
    }
}