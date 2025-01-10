package aopPractice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class loggingAspect {

    @Before("execution(* aopPractice.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp) {
        Object arg = jp.getArgs()[0]; // Get first argument
        System.out.println("Before logger - Arguments are: " + arg);
        System.out.println("Before logger executed");
    }

    @After("execution(* aopPractice.ShoppingCart.checkout(..))")
    public void afterLogger() {
        System.out.println("After logger executed");
    }

    @Pointcut("execution(* aopPractice.ShoppingCart.quantity(..))")
    public void afterReturningPointcut() {
    }

    @AfterReturning(pointcut = "afterReturningPointcut()", returning = "val")
    public void afterReturning(String val) {
        System.out.println("After returning - Value: " + val);
    }
}
