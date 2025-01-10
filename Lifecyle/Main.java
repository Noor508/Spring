package Lifecyle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
public class Main {
    public static void main(String[] args) {
        // ApplicationContext context = new ClassPathXmlApplicationContext("resources/beans.xml");
        ApplicationContext context= new AnnotationConfigApplicationContext(beanconfig.class);
        doctor1 doc = context.getBean(doctor1.class);
        doc.assist();
        doc.setQualification("MBBS");
        System.out.println(doc);
 
//Rturn the same object again
        doctor1 doc1 = context.getBean(doctor1.class);
        System.out.println(doc1);
 
    }
}
 