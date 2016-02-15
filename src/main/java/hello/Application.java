package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * is a convenience annotation that adds all of the following:
 * @Configuration
 * @EnableAutoFonfiguration
 * @EnableWebMvc although Spring Boot adds in automatically when it sees spring-web-mvc on the classpath
 * @ComponentScan : Tells Spring to look for other components, configurations, and services in the xx-package
 */
public class Application {

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);
    }

}