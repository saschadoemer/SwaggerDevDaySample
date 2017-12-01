package de.lmis.examples.swagger.devday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages = {"de.lmis.examples.swagger.devday.pets.api", "de.lmis.examples.swagger.devday.controllers"})
public class Application {

    public static void main(String[] args) {
        new SpringApplication(Application.class).run(args);
    }

}
