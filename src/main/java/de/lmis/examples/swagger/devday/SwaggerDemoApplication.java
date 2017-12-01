package de.lmis.examples.swagger.devday;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = { "de.lmis.devday.swaggerdemo.pets.api", "de.lmis.devday.swaggerdemo.controllers" })
public class SwaggerDemoApplication implements CommandLineRunner {

	@Override
	public void run(String... arg0) throws Exception {
	}

	public static void main(String[] args) throws Exception {
		new SpringApplication(SwaggerDemoApplication.class).run(args);
	}

}
