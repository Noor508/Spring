package prePostIntialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(BeanConfig1.class);
        InitializeBean bean = context.getBean(InitializeBean.class);
        System.out.println("Message from SimpleBean: " + bean.getMessage());
    }
}
