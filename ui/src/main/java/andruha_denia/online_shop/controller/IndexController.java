package andruha_denia.online_shop.controller;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class IndexController {
    private final String URL_SECURED = "https://localhost:8043/test/secured";
    private final String URL_UNSECURED = "https://localhost:8043/test/unsecured";
    private final String logPass = "user:pass";

    @RequestMapping("/")
    public String home(){
        return "web/index";
    }

    @RequestMapping("/about")
    public String about(){
        return "web/about";
    }

    @RequestMapping("/icons")
    public String icons(){
        return "web/icons";
    }

    @RequestMapping("/codes")
    public String codes(){
        return "web/codes";
    }

    @RequestMapping("/mail")
    public String mail(){
        return "web/mail";
    }

    @RequestMapping("/test/{flag}")
    public String index(@PathVariable int flag, Model model){
        byte[] bytesEncoded = Base64.encodeBase64(logPass.getBytes());
        RestTemplate template = new RestTemplate();

        String passHeader = "Basic "+new String(bytesEncoded);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", passHeader);

        HttpEntity<String> request = new HttpEntity<>(headers);
        String restData = "";
        switch (flag){
            case 1:
                restData = template.exchange(URL_SECURED, HttpMethod.GET, request, String.class).getBody();
                break;
            case 0:
                restData = template.exchange(URL_UNSECURED, HttpMethod.GET, request, String.class).getBody();
                break;
            default:
                return "test";
        }

        model.addAttribute("sata",restData);
        return "test";
    }
}
