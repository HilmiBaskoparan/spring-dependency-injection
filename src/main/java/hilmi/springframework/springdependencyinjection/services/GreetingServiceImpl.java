package hilmi.springframework.springdependencyinjection.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World !!!";
    }
}
