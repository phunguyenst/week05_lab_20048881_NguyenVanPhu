package com.iuh.phu.se.backend.services;

import com.iuh.phu.se.backend.models.Job;
import com.iuh.phu.se.backend.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    JobRepository jobRepository;

    public boolean add(Job job){
        return jobRepository.save(job).equals(job);
    }
    public boolean addAll(List<Job> list){
        return jobRepository.saveAll(list).equals(list);
    }
    public void delete(long id){
        jobRepository.deleteById(id);
    }
    public Optional<Job> getByID(long id){
        return jobRepository.findById(id);
    }
    public List<Job> getAll(){
        return jobRepository.findAll();
    }

    public boolean saveJob(Job job) {

        if (jobRepository.existsById(job.getId())) {
            return false;
        }

        jobRepository.save(job);
        return true;
    }

    public List<Job> getJobsBySkill(Long skillId) {

        return jobRepository.findByJobSkills_Skill_Id(skillId);
    }
}
