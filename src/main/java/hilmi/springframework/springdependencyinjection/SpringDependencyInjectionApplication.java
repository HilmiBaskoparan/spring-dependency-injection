package hilmi.springframework.springdependencyinjection;

import hilmi.springframework.springdependencyinjection.controllers.*;
import hilmi.springframework.springdependencyinjection.datasource.FakeDataSource;
import hilmi.springframework.springdependencyinjection.services.PrototypeBean;
import hilmi.springframework.springdependencyinjection.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"hilmi.springframework.springdependencyinjection", "com.springframework.pets"})
@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

		System.out.println("\n---------- MyController PRIMARY BEAN ----------");
		MyController myController = (MyController) context.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println("\n---------- Property ----------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("\n---------- Setter ----------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("\n---------- Constructor ----------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		// Profile
		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println("\n" + i18nController.sayHello());

		// Pet
		PetController petController = (PetController) context.getBean("petController", PetController.class);
		System.out.println("\n--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

		// Spring Bean Scope
		System.out.println("\n---------- Bean Scopes ----------");
		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getMyScope());
		SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getMyScope());

		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyScope());
		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getMyScope());

		// Property Source
		FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcUrl());
	}

}
