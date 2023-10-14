package com.iuh.phu.se.backend.services;

import com.iuh.phu.se.backend.ids.CandidateSkillID;
import com.iuh.phu.se.backend.models.Candidate;
import com.iuh.phu.se.backend.models.CandidateSkill;
import com.iuh.phu.se.backend.models.Skill;
import com.iuh.phu.se.backend.repositories.CandidateRepository;
import com.iuh.phu.se.backend.repositories.CandidateSkillRepository;
import com.iuh.phu.se.backend.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateSkillService {
    CandidateSkillRepository candidateSkillRepository;
    CandidateRepository candidateRepository;
    SkillRepository skillRepository;

    @Autowired
    public CandidateSkillService(CandidateSkillRepository candidateSkillRepository, CandidateRepository candidateRepository, SkillRepository skillRepository) {
        this.candidateSkillRepository = candidateSkillRepository;
        this.candidateRepository = candidateRepository;
        this.skillRepository = skillRepository;
    }

    public boolean add(CandidateSkill candidateSkill){
        return candidateSkillRepository.save(candidateSkill).equals(candidateSkill);

    }
    public boolean addAll(List<CandidateSkill> list){
        return candidateSkillRepository.saveAll(list).equals(list);
    }
    public List<CandidateSkill> getAll(){
        return candidateSkillRepository.findAll();
    }
    public Optional<CandidateSkill> getByID(long candidate_id, long skill_id){
        return candidateSkillRepository.findById(new CandidateSkillID(
                candidateRepository.findById(candidate_id).orElse(new Candidate()),
                skillRepository.findById(skill_id).orElse(new Skill())

        ));
    }
    public void delete(long candidate_id, long skill_id){
        candidateSkillRepository.deleteById(
                new CandidateSkillID(
                        candidateRepository.findById(candidate_id).orElse(new Candidate()),
                        skillRepository.findById(skill_id).orElse(new Skill())
                )
        );
    }
}
