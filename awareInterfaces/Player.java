package awareInterfaces;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class Player implements BeanNameAware  {

    public Player(){
        System.out.println("player is initializing..");
    }
    public void play(){

    }
    //callback method that automatically cal by the player
    @Override
    public void setBeanName(String beanName){
        System.out.println("#BeanNameAware");
        System.out.println("my beanName is "+beanName);
    }
}
