package Lifecyle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
 
@Component
// @Scope(scopeName = "singleton") by default scope
@Scope(scopeName = "prototype")
public class doctor1 implements BeanNameAware {
 
 
//this method is called first implement the aware interfaces like this
@Override
public void setBeanName(String name){
    System.out.println("set bean name method is called ");
}
//custom method implementation
//this method is called first implement the aware interfaces with annotation method
@PostConstruct
public void postConstruct(){
    System.out.println("postconstruct name method is called ");
}
 
 
@Override
public String toString(){
    return "Doctor{"+
               "qualification='"+qualification+'\''+'}';
}
 
    private String qualification;
 
    public String getQualification(){
        return qualification;
    }
   
    public void setQualification(String qualification){
        this.qualification=qualification;
    }
    public void assist(){
        System.out.println("Doctor is assisting");
    }
}