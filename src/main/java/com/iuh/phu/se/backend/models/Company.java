package com.iuh.phu.se.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "company")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comp_id", columnDefinition = "bigint(20)")
    private long id;

    @Column(columnDefinition = "varchar(2000)")
    private String about;

    private String email;

    @Column(name = "comp_name")
    private String compName;

    private String phone;

    @Column(name = "web_url")
    private String webUrl;

    @OneToOne
    @JoinColumn(name = "add_id")
    private Address address;

    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
    private List<Job> job;


}
