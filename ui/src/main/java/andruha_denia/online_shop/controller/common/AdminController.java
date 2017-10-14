package andruha_denia.online_shop.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author azozello
 * @since 06.10.17.
 */

@Controller
public class AdminController {

    @RequestMapping("/admin/main")
    public String admin(){
        return "pages/admin";
    }
}
