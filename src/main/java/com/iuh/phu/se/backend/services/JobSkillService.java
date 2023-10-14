package com.iuh.phu.se.backend.services;

import com.iuh.phu.se.backend.ids.JobSkillID;
import com.iuh.phu.se.backend.models.Job;
import com.iuh.phu.se.backend.models.JobSkill;
import com.iuh.phu.se.backend.models.Skill;
import com.iuh.phu.se.backend.repositories.JobRepository;
import com.iuh.phu.se.backend.repositories.JobSkillRepository;
import com.iuh.phu.se.backend.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobSkillService {
    JobRepository jobRepository;
    SkillRepository skillRepository;
    JobSkillRepository jobSkillRepository;

    @Autowired
    public JobSkillService(JobRepository jobRepository, SkillRepository skillRepository, JobSkillRepository jobSkillRepository) {
        this.jobRepository = jobRepository;
        this.skillRepository = skillRepository;
        this.jobSkillRepository = jobSkillRepository;
    }

    public boolean add(JobSkill jobSkill){
        return jobSkillRepository.save(jobSkill).equals(jobSkill);
    }
    public boolean addAll(List<JobSkill>list){
        return jobSkillRepository.saveAll(list).equals(list);
    }
    public List<JobSkill> getAll(){
        return jobSkillRepository.findAll();
    }

    public Optional<JobSkill> findByID(long job_id, long skill_id){
       return jobSkillRepository.findById(new JobSkillID(
                jobRepository.findById(job_id).orElse(new Job()),
                skillRepository.findById(skill_id).orElse(new Skill())
        ));

    }

    public void delete(long job_id, long skill_id){
        jobSkillRepository.deleteById(new JobSkillID(
                jobRepository.findById(job_id).orElse(new Job()),
                skillRepository.findById(skill_id).orElse(new Skill())
        ));
    }


}
