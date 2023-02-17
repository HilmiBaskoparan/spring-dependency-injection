package hilmi.springframework.springdependencyinjection.config;

import hilmi.springframework.springdependencyinjection.services.ConstructorGreetingService;
import hilmi.springframework.springdependencyinjection.services.PropertyInjectedGreetingService;
import hilmi.springframework.springdependencyinjection.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }

}
