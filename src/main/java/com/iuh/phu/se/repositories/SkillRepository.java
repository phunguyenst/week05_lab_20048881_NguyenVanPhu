package com.iuh.phu.se.repositories;

import com.iuh.phu.se.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}