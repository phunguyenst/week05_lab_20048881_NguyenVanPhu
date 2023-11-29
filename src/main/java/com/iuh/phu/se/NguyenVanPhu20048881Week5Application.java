package com.iuh.phu.se;

import com.iuh.phu.se.backend.enums.SkillLevel;
import com.iuh.phu.se.backend.enums.SkillType;
import com.iuh.phu.se.backend.models.*;
import com.iuh.phu.se.backend.repositories.*;
import com.neovisionaries.i18n.CountryCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;
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

    @Autowired
    private SkillRepository skillRepository;

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private JobSkillRepository jobSkillRepository;
    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private CandidateSkillRepository candidateSkillRepository;

    // Replace the following line with the actual code to retrieve or create a Company entity
    // @Autowired
    // private CompanyRepository companyRepository;

//    @Bean
//    CommandLineRunner initData() {
//        return args -> {
//            Random rnd = new Random();
//            for (int i = 1; i < 100; i++) {
//                String street = rnd.nextInt(1, 100) + "";
//                String city = "Quang Trung";
//                String country = "HCM";
//                String number = rnd.nextInt(70000, 80000) + "";
//                CountryCode countryCode = CountryCode.VN;
//                String zipcode = rnd.nextInt(70000, 80000) + "";
//                Address add = new Address(street, city, countryCode, number, zipcode);
//                addressRepository.save(add);
//
//                LocalDate dob = LocalDate.of(1998, rnd.nextInt(1, 13), rnd.nextInt(1, 29));
//                String fullName = "Name #" + i;
//                String phone = rnd.nextLong(1111111111L, 9999999999L) + "";
//                String email = "email_" + i + "@gmail.com";
//
//                Candidate can = new Candidate(dob, email, fullName, phone, add);
//                candidateRepository.save(can);
//                System.out.println("Added: " + can);
//
//                String skillDesc = "Skill description #" + i;
//                String skillName = "Skill #" + i;
//                SkillType skillType = SkillType.values()[rnd.nextInt(SkillType.values().length)];
//                Skill skill = new Skill(skillDesc, skillName, skillType);
//                skillRepository.save(skill);
//                System.out.println("Added Skill: " + skill);
//
//                String jobDesc = "Job description #" + i;
//                String jobName = "Job #" + i;
//
//                Company company = new Company("Company #" + i);
//                companyRepository.save(company);
//
//                Job job = new Job(jobDesc, jobName, company);
//                jobRepository.save(job);
//                job = jobRepository.findById(job.getId()).orElse(null);

//                for (int j = 0; j < 5; j++) {
//                    skill = skillRepository.findById(rnd.nextLong(1, 101)).orElse(null);
//                    if (skill != null) {
//                        JobSkill jobSkill = new JobSkill(job, skill);
//                        jobSkill.setMoreInfo("Additional information for skill #" + skill.getId());
//                        jobSkill.setSkillLevel(SkillLevel.values()[rnd.nextInt(SkillLevel.values().length)]);
//
//                        // Set the Job instance in the JobSkill entity
//                        jobSkill.setJob(job);
//
//                        jobSkillRepository.save(jobSkill);
//                        System.out.println("Associated Skill with Job: " + jobSkill);
//                    }
//                }
//                List<Candidate> candidates = candidateRepository.findAll();
//                for (Candidate candidate : candidates) {
//                    if (!candidate.isNew()) {
//                        List<Skill> candidateSkills = skillRepository.findAll();
//                        for (Skill skillss : candidateSkills) {
//                            String moreInfo = "Additional information for skill #" + skillss.getId();
//                            SkillLevel skillLevel = SkillLevel.values()[rnd.nextInt(SkillLevel.values().length)];
//
//                            CandidateSkill candidateSkill = new CandidateSkill(candidate, skillss, moreInfo, skillLevel);
//                            candidateSkillRepository.save(candidateSkill);
//
//                            System.out.println("Associated Skill with Candidate: " + candidateSkill);
//                        }
//                    }
//                }

                //khoa duoi
//            }
//
//        };
//    }
}
