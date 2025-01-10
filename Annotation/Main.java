package Annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
		
	      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("--------Annotation based");
	      Doctor doc = context.getBean(Doctor.class);
	      doc.assist();
	      Nurse nurse = context.getBean(Nurse.class);
	      nurse.assist();
	   
}
}
