package com.iuh.phu.se.frontend.controllers;

import com.iuh.phu.se.backend.models.Candidate;
import com.iuh.phu.se.backend.models.Skill;
import com.iuh.phu.se.backend.repositories.CandidateRepository;
import com.iuh.phu.se.backend.repositories.SkillRepository;
import com.iuh.phu.se.backend.services.CandidateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class CandidateController {
    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private CandidateServices candidateServices;

    @Autowired
    private SkillRepository skillRepository;
    @GetMapping("/list")
    public String showCandidateList(Model model){
        model.addAttribute("candidates", candidateRepository.findAll());
        return "candidates/candidates";
    }
    @GetMapping("/candidates")
    public String showCandidateListPaging(Model model, @RequestParam("page")Optional<Integer> page, @RequestParam("size")Optional<Integer> size){
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(10);
        Page<Candidate> candidatePage = candidateServices.getAll(currentPage - 1, pageSize, "id", "asc");
        model.addAttribute("candidatePage", candidatePage);
        int totalPages  =candidatePage.getTotalPages();
        System.out.println(totalPages);
        if(totalPages > 0){

            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);

        }
        return "candidates/candidates-paging";
    }
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Optional<Candidate> candidate = candidateRepository.findById(id);
        model.addAttribute("candidate", candidate.orElse(null));
        return "candidates/update-candidates";
    }

    @PostMapping("/update")
    public String updateCandidate(@ModelAttribute Candidate candidate) {
        candidateRepository.save(candidate);
        return "redirect:/candidates";
    }

    @GetMapping("/delete/{id}")
    public String showDeleteForm(@PathVariable Long id, Model model) {
        Optional<Candidate> candidate = candidateRepository.findById(id);
        model.addAttribute("candidate", candidate.orElse(null));
        return "candidates/delete-candidates";
    }

    @PostMapping("/delete")
    public String deleteCandidate(@ModelAttribute Candidate candidate) {
        candidateRepository.deleteById(candidate.getId());
        return "redirect:/candidates";
    }

    @GetMapping("/suggest-skill")
    public String suggestSkill(@RequestParam("candidate-id") Optional<Long> candidateId,
                               Model model) {
        List<Candidate> candidates = candidateRepository.findAll();

        if (candidateId.isPresent()) {
            List<Skill> skills = skillRepository.findSkillsNotInCandidate(candidateId.get());

            model.addAttribute("skills", skills);
            model.addAttribute("candidateId", candidateId.get());
        }
        model.addAttribute("candidates", candidates);

        return "candidates/suggestSkill";
    }




}
