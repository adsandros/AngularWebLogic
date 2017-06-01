package ve.com.farmatodo.item.base;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ve.com.farmatodo.item.constantes.Constantes;

/**
 * Created by atoro on 10/05/2017.
 */

@Controller
@RequestMapping("/")
public class Loginb {

    @RequestMapping(method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(method = RequestMethod.GET, path = "home")
    public String index() {
        return "index";
    }

    @RequestMapping(method = RequestMethod.GET, path = "demo")
    public String home() {
        return "demo";
    }

    @RequestMapping(method = RequestMethod.GET, path = "header")
    @ResponseBody
    public String header(BindingResult result) {
        result.rejectValue("NameApp", Constantes.NOMBRE_APLICACION);
        return "fragments/header";
    }

}
