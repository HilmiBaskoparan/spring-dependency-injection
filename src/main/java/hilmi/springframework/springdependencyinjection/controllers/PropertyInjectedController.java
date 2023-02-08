package hilmi.springframework.springdependencyinjection.controllers;

import hilmi.springframework.springdependencyinjection.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
