package javaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "javaConfiguration")
public class BeanConfig {
	@Bean
	public Doctor doctor()
	{
		System.out.println("bean user defined");
		return new Doctor();
	}

}
