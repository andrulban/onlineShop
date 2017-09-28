package andruha_denia.online_shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class IndexController {
    private final String URL_SECURED = "https://localhost:8043/test/secured";
    private final String URL_UNSECURED = "https://localhost:8043/test/unsecured";

    @Autowired
    private RestTemplate template;

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
        String restData = "";
        switch (flag){
            case 1:
                restData = template.getForObject(URL_SECURED,String.class);
                break;
            case 0:
                restData = template.getForObject(URL_UNSECURED, String.class);
                break;
            default:
                return "test";
        }

        model.addAttribute("sata",restData);
        return "test";
    }
}
