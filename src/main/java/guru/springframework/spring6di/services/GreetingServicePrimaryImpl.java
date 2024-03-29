package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimaryImpl implements GreetingService {
    @Override
    public String sayHi() {
        return "Hi from the primary";
    }
}
