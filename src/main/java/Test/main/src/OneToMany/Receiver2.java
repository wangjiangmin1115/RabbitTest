package Test.main.src.OneToMany;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "everyone")
public class Receiver2 {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("every Receiver2  : " + hello);
    }

}
