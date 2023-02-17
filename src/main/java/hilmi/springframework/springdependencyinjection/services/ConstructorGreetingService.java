package hilmi.springframework.springdependencyinjection.services;

public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! -> CONSTRUCTOR";
    }
}
