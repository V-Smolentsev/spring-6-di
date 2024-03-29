package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.MyController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

    @Autowired
    ApplicationContext context;
    @Autowired
    MyController myController;

    @Test
    void testWiredController() {
        System.out.println(myController.say());
    }

    @Test
    void contextLoads() {
        MyController bean = context.getBean(MyController.class);
        Assertions.assertEquals("Say smth", bean.say());
    }

}
