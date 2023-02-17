package hilmi.springframework.springdependencyinjection.services;

public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! -> PROPERTY";
    }
}
