package aopPractice;
 
import org.springframework.stereotype.Component;
 
@Component
public class ShoppingCart {
    public void checkout(String status){
        // Logging
        // authentication and authorization
        // sanitize the data
        System.out.println("checkout method for shopping cart called");
    }
    public int quantity(){
        return 2;  // we can access using after returning annotation
    }
}
 
