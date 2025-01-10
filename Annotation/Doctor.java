package Annotation;

import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff {
	@Override
	public void assist() {
		// TODO Auto-generated method stub
		System.out.println("Doctor is assisting");

	}
	
}
