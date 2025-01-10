package Xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Hospital {
	public static void main(String[] args) {
		
	      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	      Doctor doc = context.getBean(Doctor.class);
	        doc.assist();
	        System.out.println(doc.getQualification());
	      //by bean id
	      Nurse nurse =(Nurse) context.getBean("nurse");
	      nurse.assist();
	      
	      Staff staff = (Staff) context.getBean("doctor");
	      staff.assist();
	    }
}
