package com.iuh.phu.se.backend.models;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;

import java.util.List;


@Entity
@Table(name = "candidate")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "{id}")
@Builder
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

    @OneToMany(mappedBy = "candidate",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<CandidateSkill> candidateSkills;

    @OneToMany(mappedBy = "candidate",fetch = FetchType.EAGER)
    private List<Experience> experiences;

    public Candidate(LocalDate dob, String email, String fullName, String phone, Address address) {
        this.dob = dob;
        this.email = email;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
    }

    public boolean isNew() {
        return this.id == 0;
    }
}
