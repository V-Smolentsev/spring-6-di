package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInject implements GreetingService{
    @Override
    public String sayHi() {
        return "No Property injection";
    }
}
