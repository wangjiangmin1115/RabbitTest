package Test.main.src.OneToMany;

import com.rabbitmq.http.client.domain.ExchangeType;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SenderEveryone {

    @Autowired
    private RabbitTemplate rabbitTemplate;


//    @RabbitListener(
//            bindings = @QueueBinding(
//                    value = @Queue(value = "everyone"),
//                    exchange = @Exchange(value = "topic" ,type = ExchangeTypes.FANOUT)
//            )
//
//    )
    public void sendMessage(){
        System.out.println("start message to everyone");
        String message = "sss";
        rabbitTemplate.convertAndSend("everyone",message);
    }


    public void sendto(){}

}
