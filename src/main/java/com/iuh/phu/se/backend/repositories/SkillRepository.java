package com.iuh.phu.se.backend.repositories;

import com.iuh.phu.se.backend.models.Job;
import com.iuh.phu.se.backend.models.Skill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource
public interface SkillRepository extends JpaRepository<Skill, Long> {
    Optional<Skill> findBySkillName(String skillName);
    @Query("SELECT s FROM Skill s " +
            "WHERE NOT EXISTS (" +
            "   SELECT 1 FROM CandidateSkill cs " +
            "   WHERE cs.candidate.id = :candidateId " +
            "   AND cs.skill.id = s.id" +
            ")")
    List<Skill> findSkillsNotInCandidate(@Param("candidateId") Long candidateId);

}