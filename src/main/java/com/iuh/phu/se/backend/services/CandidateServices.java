package com.iuh.phu.se.backend.services;

import com.iuh.phu.se.backend.models.Candidate;
import com.iuh.phu.se.backend.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateServices {
    @Autowired
    CandidateRepository candidateRepository;
    public boolean add(Candidate candidate){
        return candidateRepository.save(candidate).equals(candidate);
    }
    public boolean addAll(List<Candidate> lstCan){
        return candidateRepository.saveAll(lstCan).equals(lstCan);
    }
    public void delete(long id){
        candidateRepository.deleteById(id);
    }
    public Optional<Candidate> getByID(long id){
        return candidateRepository.findById(id);
    }
    public List<Candidate> getAll(){
        return candidateRepository.findAll();
    }
}
