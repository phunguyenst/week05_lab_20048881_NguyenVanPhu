package com.iuh.phu.se;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EntityScan(...)
//@EnableJpaRepositories(basePackages = "...")
public class NguyenVanPhu20048881Week5Application {
    public static void main(String[] args) {
        SpringApplication.run(NguyenVanPhu20048881Week5Application.class, args);
    }

//    @Bean
//    public CommandLineRunner lineRunner(){
//        return new CommandLineRunner() {
//            @Override
//            public void run(String... args) throws Exception {
//                entityManager.createEntityManager().getTransaction().begin();
//            }
//        };
//    }

}
