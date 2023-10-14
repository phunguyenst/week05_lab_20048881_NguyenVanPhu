package com.iuh.phu.se.backend.models;


import com.iuh.phu.se.backend.enums.SkillLevel;
import com.iuh.phu.se.backend.ids.CandidateSkillID;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "candidate_skill")
@IdClass(CandidateSkillID.class)
public class CandidateSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;

    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Column(name = "more_infos")
    private String moreInfo;
    @Column(name = "skill_level")
    private SkillLevel skillLevel;
}
