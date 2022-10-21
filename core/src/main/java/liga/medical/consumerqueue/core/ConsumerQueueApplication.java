package liga.medical.consumerqueue.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("liga.medical.consumerqueue")
public class ConsumerQueueApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerQueueApplication.class, args);
    }
}
