package kr.co.buy4me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Buy4meApplication {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "test");

        SpringApplication.run(Buy4meApplication.class, args);
    }
}
