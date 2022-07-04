package level4.lesson10;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Message {
    @PostConstruct
    void postConstruct() {
        System.out.println("Hi from @PostConstruct");
    }

    @PreDestroy
    void preDestroy() {
        System.out.println("Hi from @PreDestroy");
    }
}
