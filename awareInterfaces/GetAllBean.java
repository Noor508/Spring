package awareInterfaces;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class GetAllBean implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        System.out.println("#ApplicationContextAware.");
    }

    public void printBeanDefinitionNames() {
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanNames) {
            System.out.println(name);
        }
    }
}

