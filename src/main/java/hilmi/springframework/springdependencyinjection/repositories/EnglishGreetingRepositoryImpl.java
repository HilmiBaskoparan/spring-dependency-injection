package hilmi.springframework.springdependencyinjection.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello World -> ENG";
    }
}
