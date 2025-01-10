package prePostIntialization;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component("bb")
public class InitializeBean implements InitializingBean, BeanPostProcessor {
        // This method is called after all properties/fields are set
        private String message;

    // Constructor
    public InitializeBean() {
        this.message = "Hello, Spring!";
    }
    // BeanPostProcessor before initialization
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("BeanPostProcessor (Before): Modifying the bean before initialization");
        return bean;
    }
    // @PostConstruct initialization
    @PostConstruct
    public void init() {
        System.out.println("PostConstruct: Bean is initialized with message: " + message);
    }

    // InitializingBean's afterPropertiesSet method
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean: Bean properties are set.");
    }


    // BeanPostProcessor after initialization
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("BeanPostProcessor (After): Modifying the bean after initialization");
        return bean;
    }

    // Getter to print the message in performAction
    public String getMessage() {
        return message;
    }

    // Setter to modify the message if needed
    public void setMessage(String message) {
        this.message = message;
    }
}

