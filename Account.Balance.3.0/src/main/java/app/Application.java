package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= { "app" })
public class Application {
    
    public static void main(String[] args) {
    	System.out.println("hello geeks");
        SpringApplication.run(Application.class, args);
    }
}