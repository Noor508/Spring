package aopPractice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
 
public class Main {
     private static ApplicationContext context;

	public static void main(String[] args) {
       context = new AnnotationConfigApplicationContext(BeanConfig.class);
    ShoppingCart cart = context.getBean(ShoppingCart.class);
    cart.checkout("cancle");
    cart.quantity();
    }
}
 