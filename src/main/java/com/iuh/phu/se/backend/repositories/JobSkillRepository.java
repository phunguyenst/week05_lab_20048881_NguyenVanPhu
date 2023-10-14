package com.iuh.phu.se.backend.repositories;

import com.iuh.phu.se.backend.ids.JobSkillID;
import com.iuh.phu.se.backend.models.JobSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface JobSkillRepository extends JpaRepository<JobSkill, JobSkillID> {
}