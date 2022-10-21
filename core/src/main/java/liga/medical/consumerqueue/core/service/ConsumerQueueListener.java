package liga.medical.consumerqueue.core.service;

import liga.medical.consumerqueue.core.model.QueueNames;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerQueueListener {

    @RabbitListener(queues = QueueNames.DAILY_QUEUE_NAME)
    public void listenDailyQueue(String message) {
        System.out.println(String.format("Прослушано сообщение [%s] из очереди [%s]", message, QueueNames.DAILY_QUEUE_NAME));
    }

    @RabbitListener(queues = QueueNames.ALERT_QUEUE_NAME)
    public void listenAlertQueue(String message) {
        System.out.println(String.format("Прослушано сообщение [%s] из очереди [%s]", message, QueueNames.ALERT_QUEUE_NAME));
    }

    @RabbitListener(queues = QueueNames.ERROR_QUEUE_NAME)
    public void listenErrorQueue(String message) {
        System.out.println(String.format("Прослушано сообщение [%s] из очереди [%s]", message, QueueNames.ERROR_QUEUE_NAME));
    }
}
