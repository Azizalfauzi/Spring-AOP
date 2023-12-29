package zuhaproject.aop.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class HelloService {
    public String hello(String name) {
        log.info("Call method hello");
        return "Hello " + name;
    }

    public String bye(String name) {
        log.info("Call method bye");
        return "Bye " + name;
    }

    public void test() {
        log.info("Call helloService.test()");
    }
}
