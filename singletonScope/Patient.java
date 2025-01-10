package singletonScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "singleton") // every time get same object 
public class Patient {
	private String doctorName;
	void checkup()
	{
		System.out.println("Patient is wait for doctor");
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	@Override
	public String toString() {
		return "Patient [doctorName=" + doctorName + "]";
	}
	
	
}
