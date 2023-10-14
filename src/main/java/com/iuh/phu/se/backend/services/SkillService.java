package com.iuh.phu.se.backend.services;

import com.iuh.phu.se.backend.models.Skill;
import com.iuh.phu.se.backend.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService {
    @Autowired
    SkillRepository skillRepository;

    public boolean add(Skill skill){
        return skillRepository.save(skill).equals(skill);
    }
    public boolean addAll(List<Skill> list){
        return skillRepository.saveAll(list).equals(list);
    }
    public List<Skill> getAll(){
        return skillRepository.findAll();
    }
    public Optional<Skill> findByID(long id){
        return skillRepository.findById(id);
    }
    public void delete(long id){
        skillRepository.deleteById(id);
    }
}
