package com.iuh.phu.se.backend.repositories;

import com.iuh.phu.se.backend.models.Candidate;
import com.iuh.phu.se.backend.models.Job;
import com.iuh.phu.se.backend.models.JobSkill;
import com.iuh.phu.se.backend.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource
public interface JobRepository extends JpaRepository<Job, Long> {
    @Query("SELECT DISTINCT j FROM Job j " +
            "JOIN j.jobSkills js " +
            "JOIN js.skill s " +
            "WHERE s IN :skills")
    List<Job> findJobsByCandidateSkills(@Param("skills") List<Skill> skills);
    List<Job> findByJobSkillsIn(List<JobSkill> jobSkills);

    List<Job> findByJobSkills_Skill_Id(Long skillId);

}