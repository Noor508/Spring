package awareInterfaces;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="awareInterfaces")
public class AppConfig {
    @Bean
    public Player player(){
        return new Player();
    }

    @Scope("singleton")
    @Bean(name = "bean1")
    public Player player2(){
        return new Player();
    }


}
