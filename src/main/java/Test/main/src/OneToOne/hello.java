package Test.main.src.OneToOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class hello {

    @Autowired
    HelloSender1 helloSender1;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hi() {
        System.out.println("message start");
        helloSender1.send();
        System.out.println("message start");
        return "111";
    }
}
