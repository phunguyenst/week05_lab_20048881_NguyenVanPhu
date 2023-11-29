package com.iuh.phu.se.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "job")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id", columnDefinition = "bigint(20)")
    private long id;

    @Column(name = "job_desc", columnDefinition = "varchar(2000)")
    private String jobDesc;
    @Column(name = "job_name")
    private String jobName;

    @ManyToOne
    @JoinColumn(name = "comp_id")
    private Company company;

    @OneToMany(mappedBy = "job", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<JobSkill> jobSkills;

    public Job(String jobDesc, String jobName, Company company) {
        this.jobDesc = jobDesc;
        this.jobName = jobName;
        this.company = company;
    }
}
