package stock;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class ProductApplication {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = SpringApplication.run(ProductApplication.class, args);
        ConfigurableEnvironment environment = context.getEnvironment();
        while (true) {
            String id = environment.getProperty("demo.id");
            String name = environment.getProperty("demo.name");
            System.out.println("id=" + id + "; name=" + name);
            TimeUnit.SECONDS.sleep(3);
        }
    }
}
