package ve.com.farmatodo.item.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by atoro on 10/05/2017.
 */

@Controller
@RequestMapping("/")
public class AppController {
    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "demo";
    }
}
