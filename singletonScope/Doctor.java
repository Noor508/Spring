package singletonScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope(scopeName = "prototype") //get new object every time
@Component
public class Doctor implements Staff {
	private String  qualification ;
	
	@Override
	public void assist() {
		// TODO Auto-generated method stub
		System.out.println("Doctor is assisting");

	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Doctor [qualification=" + qualification + "]";
	}
	
	
	
}
