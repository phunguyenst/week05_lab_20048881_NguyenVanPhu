package com.iuh.phu.se.backend.services;

import com.iuh.phu.se.backend.models.Experience;
import com.iuh.phu.se.backend.repositories.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExperiencesService {
    @Autowired
    ExperienceRepository experienceRepository;

    public boolean add(Experience experience){
        return experienceRepository.save(experience).equals(experience);
    }
    public boolean addAll(List<Experience> list){
        return experienceRepository.saveAll(list).equals(list);
    }
    public void delete(long id){
        experienceRepository.deleteById(id);
    }
    public Optional<Experience> getByID(long id){
        return experienceRepository.findById(id);
    }
    public List<Experience> getAll(){
        return experienceRepository.findAll();
    }
}
