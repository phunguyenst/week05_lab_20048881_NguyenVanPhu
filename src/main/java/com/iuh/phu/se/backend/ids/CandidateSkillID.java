package com.iuh.phu.se.backend.ids;

import com.iuh.phu.se.backend.models.Candidate;
import com.iuh.phu.se.backend.models.Skill;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor

public class CandidateSkillID implements Serializable {
    private Candidate candidate;
    private Skill skill;

}
