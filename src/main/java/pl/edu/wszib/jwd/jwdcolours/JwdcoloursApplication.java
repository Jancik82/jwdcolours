package pl.edu.wszib.jwd.jwdcolours;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:db.properties")
public class JwdcoloursApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwdcoloursApplication.class, args);
    }

}
