package com.iuh.phu.se.models;

import com.iuh.phu.se.enums.SkillType;
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

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<JobSkill> jobSkills;
}
