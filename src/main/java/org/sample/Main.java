package org.sample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SecretConfiguration.class)
public class Main implements CommandLineRunner {

    private final SecretConfiguration configuration;

    public Main(SecretConfiguration configuration) {
        this.configuration = configuration;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("username : " + configuration.getUsername());
        System.out.println("password : " + configuration.getPassword());

    }
}
