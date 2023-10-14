package com.iuh.phu.se.backend.ids;

import com.iuh.phu.se.backend.models.Job;
import com.iuh.phu.se.backend.models.Skill;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode( of = "{id}")
public class JobSkillID implements Serializable {
    private Job job;
    private Skill skill;


}
