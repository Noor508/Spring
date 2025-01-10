package springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Main {
    public static void main(String[] args) {
        // Load Spring context and configuration from beans.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("sprint.xml");
 
        // Retrieve the Car bean from the Spring container
        Car car = (Car) context.getBean("car");
 
        // Call the method to test the injected dependencies
        car.drive();
    }
}