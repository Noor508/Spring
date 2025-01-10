package aopPractice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(aopPractice..*)")
    public void authenticationPointcut() {
    }

    @Pointcut("within(aopPractice.ShoppingCart..*)") // Ensure ShopingCart is correct
    public void authorizationPointcut() {
    }

    @Before("authenticationPointcut() && authorizationPointcut()")
    public void authenticate() {
        System.out.println("Authenticating the request");
    }
}
