package zuhaproject.aop.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    @Test
    void helloServiceTest() {
        Assertions.assertEquals("Hello Aziz", helloService.hello("Aziz"));

        Assertions.assertEquals("Bye Aziz", helloService.bye("Aziz"));
    }
}
