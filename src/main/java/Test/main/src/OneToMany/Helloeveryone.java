package Test.main.src.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Helloeveryone {

    @Autowired
    SenderEveryone helloSender1;

    @RequestMapping(value = "/hievery",method = RequestMethod.GET)
    public String hi() {
        System.out.println("message start");
        helloSender1.sendMessage();
        System.out.println("message start");
        return "111";
    }
}

