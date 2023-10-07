package com.iuh.phu.se.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "job")
@NoArgsConstructor
@AllArgsConstructor
@Data
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
}
