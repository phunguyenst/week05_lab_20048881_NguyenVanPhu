package com.iuh.phu.se.backend.models;

import com.iuh.phu.se.backend.enums.SkillType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "skill")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id", columnDefinition = "bigint(20)")
    private long id;
    @Column(name = "skill_desc", columnDefinition = "varchar(300)")
    private String skillDesc;
    @Column(name = "skill_name", columnDefinition = "varchar(150)")
    private String skillName;

    @Column(name = "skill_type")
    private SkillType skillType;

    @OneToMany(mappedBy = "skill", fetch = FetchType.EAGER)
    private List<JobSkill> jobSkills;

    public Skill(String skillDesc, String skillName, SkillType skillType) {
        this.skillDesc = skillDesc;
        this.skillName = skillName;
        this.skillType = skillType;
    }
}
