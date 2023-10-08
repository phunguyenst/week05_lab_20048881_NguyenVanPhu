package com.iuh.phu.se.models;

import com.iuh.phu.se.models.Address;
import com.iuh.phu.se.models.CandidateSkill;
import com.iuh.phu.se.models.Experience;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

import java.util.List;


@Entity
@Table(name = "candidate")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "{id}")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "can_id", columnDefinition = "bigint(20)")
    private long id;

    @Column(columnDefinition = "date")
    private LocalDate dob;

    private String email;

    @Column(name = "full_name")
    private String fullName;

    @Column(columnDefinition = "varchar(15)")
    private String phone;
    @OneToOne
    @JoinColumn(name = "address")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<CandidateSkill> candidateSkills;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Experience> experiences;


}
