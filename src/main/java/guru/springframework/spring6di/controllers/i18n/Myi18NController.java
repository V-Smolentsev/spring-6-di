package guru.springframework.spring6di.controllers.i18n;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class Myi18NController {
    private final GreetingService service;

    public Myi18NController(@Qualifier("i18NService") GreetingService service) {
        this.service = service;
    }

    public String sayHello() {
        return service.sayHi();
    }
}
