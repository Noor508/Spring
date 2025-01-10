package awareInterfaces;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

@Component
public class BeanInfo implements BeanFactoryAware {
    //print bean related information i want to get hold to the bean
public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    System.out.println("#BeanFactoryAware");
    boolean isSingleton =beanFactory.isSingleton("bean1");
    System.out.println("my bean scope is singleton?"+ isSingleton);
}
}
