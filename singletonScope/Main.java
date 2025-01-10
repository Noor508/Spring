package singletonScope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
		
	      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	      
	      System.out.println("-------Singleton object------");
	      Patient p1 = context.getBean(Patient.class);
	      p1.setDoctorName("Raheel");
	      System.out.println(p1);
	      
	      Patient p2 = context.getBean(Patient.class);
	      System.out.println(p2);
	      
	      System.out.println("-------Prototype object Behavior-------");
	      Doctor doc = context.getBean(Doctor.class);
	      doc.setQualification("MBBS");
	      System.out.println(doc);
	  
	      Doctor doc1 = context.getBean(Doctor.class);
	      System.out.println("prototype object :" + doc1);
	     
}
}
