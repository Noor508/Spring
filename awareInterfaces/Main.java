package awareInterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container =new AnnotationConfigApplicationContext(AppConfig.class);
        container.getBean("bean1",Player.class);
        BeanInfo beanInfo=container.getBean(BeanInfo.class);
        GetAllBean getAllBean = container.getBean(GetAllBean.class);
        getAllBean.printBeanDefinitionNames();
        ResourceLoaderExample R = container.getBean(ResourceLoaderExample.class);
        R.loadResource();
    }
}
