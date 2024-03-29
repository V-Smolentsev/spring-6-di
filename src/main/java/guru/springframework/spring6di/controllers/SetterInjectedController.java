package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService service;

    @Qualifier("setterGreetingBean")
    @Autowired
    public void setService(GreetingService service) {
        this.service = service;
    }

    public String sayHello() {
        return service.sayHi();
    }
}
