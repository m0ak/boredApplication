package at.upstream_mobility.itacademy.bored;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // auto-configuration (sets up common dependencies)
                        // component scanning (scans for classes)
                        // extra configuration (allows to add custom configurations)
public class BoredApplication {
    public static void main(String[] args) {
        SpringApplication.run(BoredApplication.class, args);
    }
}