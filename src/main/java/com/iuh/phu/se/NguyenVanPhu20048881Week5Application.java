package com.iuh.phu.se;

import com.iuh.phu.se.backend.models.Address;
import com.iuh.phu.se.backend.models.Candidate;
import com.iuh.phu.se.backend.repositories.AddressRepository;
import com.iuh.phu.se.backend.repositories.CandidateRepository;
import com.neovisionaries.i18n.CountryCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Random;


@SpringBootApplication
//@EntityScan(...)
//@EnableJpaRepositories(basePackages = "...")
public class NguyenVanPhu20048881Week5Application {
    public static void main(String[] args) {
        SpringApplication.run(NguyenVanPhu20048881Week5Application.class, args);
    }
    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private AddressRepository addressRepository;
//    @Bean
//    CommandLineRunner initData(){
//        return args -> {
//            Random rnd =new Random();
//            for (int i = 1; i < 1000; i++) {
//                String street = rnd.nextInt(1, 1000) + "";
//                String city = "Quang Trung";
//                String country = "HCM";
//                String number = rnd.nextInt(70000, 80000) + "";
//                CountryCode countryCode = CountryCode.VN;
//                String zipcode = rnd.nextInt(70000,80000)+"";
//                Address add = new Address(street, city, countryCode, number, zipcode); // Replace null with the appropriate zipCode if needed
//                addressRepository.save(add);
//                LocalDate dob = LocalDate.of(1998, rnd.nextInt(1, 13), rnd.nextInt(1, 29));
//                String fullName = "Name #" + i;
//                String phone = rnd.nextLong(1111111111L, 9999999999L) + "";
//                String email = "email_" + i + "@gmail.com";
//
//                Candidate can = new Candidate(dob, email, fullName, phone, add); // Reordered parameters
//                candidateRepository.save(can);
//                System.out.println("Added: " + can);
//
//
//            }
//        };
//    }


}
