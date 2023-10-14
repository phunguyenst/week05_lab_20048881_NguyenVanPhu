package com.iuh.phu.se.backend.resources;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import com.iuh.phu.se.backend.services.CandidateServices;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateResources {
    @Autowired
    private CandidateServices candidateServices;

    @GetMapping
    public String getAll(Model model){
        model.addAttribute("candidates", candidateServices.getAll());
        return "candidate/candidates";
    }

}
