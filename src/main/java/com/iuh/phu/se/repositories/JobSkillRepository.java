package com.iuh.phu.se.repositories;

import com.iuh.phu.se.models.Job;
import com.iuh.phu.se.models.JobSkill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSkillRepository extends JpaRepository<JobSkill, Job> {
}