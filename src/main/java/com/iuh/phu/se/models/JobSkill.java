package com.iuh.phu.se.models;

import com.iuh.phu.se.enums.SkillLevel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Table(name = "job_skill")
public class JobSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Column(name = "more_infos")
    private String moreInfo;
    @Column(name = "skill_level")
    private SkillLevel skillLevel;


}
