package javaConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
	public static void main(String[] args) {
		
//	      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	    ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		System.out.println("-------Java based application context------");
		Doctor doc = context.getBean(Doctor.class);
	      doc.assist();
	      Nurse nurse = context.getBean(Nurse.class);
	      nurse.assist();
	   
}
}
 