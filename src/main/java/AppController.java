/**
 * Created by Rodrigo on 18/06/2017.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String home() {
        return "index";
    }

}
