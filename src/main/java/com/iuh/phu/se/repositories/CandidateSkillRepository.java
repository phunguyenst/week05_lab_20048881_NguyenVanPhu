package com.iuh.phu.se.repositories;

import com.iuh.phu.se.models.Candidate;
import com.iuh.phu.se.models.CandidateSkill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, Candidate> {
}