package aopPractice;
 
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
 
@Configuration
@ComponentScan(basePackages = "aopPractice")  
@EnableAspectJAutoProxy
public class BeanConfig {
}
