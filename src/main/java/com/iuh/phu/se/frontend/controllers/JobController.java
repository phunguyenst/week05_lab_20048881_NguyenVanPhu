package com.iuh.phu.se.frontend.controllers;

import com.iuh.phu.se.backend.models.*;
import com.iuh.phu.se.backend.repositories.*;
import com.iuh.phu.se.backend.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class JobController {

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private SkillRepository skillRepository;

    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private JobSkillRepository jobSkillRepository;

    @Autowired
    private JobService jobService;

    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private CandidateSkillRepository candidateSkillRepository;

    @GetMapping("/jobManager")
    public String showJobList(Model model) {

        model.addAttribute("jobs", jobRepository.findAll());
        return "jobs/jobManager";
    }

    @GetMapping("/create")
    public String showCreateJobForm(Model model) {
        model.addAttribute("job", new Job());
        model.addAttribute("companies", companyRepository.findAll()); // Thêm danh sách các công ty để hiển thị trong dropdown
        return "jobs/createJob";
    }

    @PostMapping("/create")
    public String createJob(@ModelAttribute Job job, Model model) {
        boolean isSaved = jobService.saveJob(job);

        if (isSaved) {
            model.addAttribute("successMessage", "Job created successfully!");
            return "redirect:/jobManager";
        } else {
            model.addAttribute("errorMessage", "Job with the same ID already exists.");
        }

        // Reload danh sách công ty để hiển thị trong dropdown khi có lỗi
        model.addAttribute("companies", companyRepository.findAll());
        return "createJob";
    }
    @GetMapping("/search")
    public String searchJobs(@RequestParam("skillId") Long skillId, Model model) {
        List<Job> jobs = jobService.getJobsBySkill(skillId);
        model.addAttribute("jobs", jobs);
        return "jobs/jobManager";
    }

    @GetMapping("/suggestJob")
    public String suggestJob(Model model) {

        Candidate defaultCandidate = new Candidate();
        defaultCandidate.setFullName("Anonymous");

        List<Skill> candidateSkills = defaultCandidate.getCandidateSkills()
                .stream()
                .map(CandidateSkill::getSkill)
                .collect(Collectors.toList());

        List<Job> suggestedJobs = jobRepository.findJobsByCandidateSkills(candidateSkills);
        for (Job job: suggestedJobs){
            System.out.println("cac job" + job);
        }

        model.addAttribute("suggestedJobs", suggestedJobs);
        model.addAttribute("currentCandidate", defaultCandidate);

        return "jobs/suggestJob";
    }






}
