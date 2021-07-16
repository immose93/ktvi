package com.kt.smta.vi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing  // JPA Auditing 어노테이션들 모두 활성화할 수 있게 함
@SpringBootApplication
public class ViApplication {

    public static void main(String[] args) {
        SpringApplication.run(ViApplication.class, args);
    }

}
