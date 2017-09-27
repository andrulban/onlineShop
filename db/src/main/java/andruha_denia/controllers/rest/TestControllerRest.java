package andruha_denia.controllers.rest;

import com.sun.xml.internal.ws.server.sei.MessageFiller;
import org.apache.log4j.Logger;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Decoder;

import java.util.List;
import java.util.Map;

/**
 * @author azozello
 * @since 17.09.17.
 */

@RestController
@RequestMapping("/test")
public class TestControllerRest {
    private static final Logger LOG = Logger.getLogger(TestControllerRest.class);

    @RequestMapping("/unsecured")
    public String error(@RequestHeader("Authorization") String header) {
        return header;
    }

    @RequestMapping("/secured")
    public String testData(@RequestHeader("Authorization") String header){
        try {
            System.out.println(header);
        } catch (Exception e){
            e.printStackTrace();
        }
        return "Some important information: ";
    }
}
