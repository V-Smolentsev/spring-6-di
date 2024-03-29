package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHi() {
        return "Hyi";
    }
}
