package com.iuh.phu.se.backend.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "experience")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exp_id")
    private long id;

    @Column(columnDefinition = "varchar(120)")
    private String company;
    @Column(name = "from_date", columnDefinition = "date")
    private LocalDate fromDate;

    @Column(columnDefinition = "varchar(100)")
    private String role;
    @Column(name = "to_date", columnDefinition = "date")
    private LocalDate toDate;
    @Column(name = "work_desc",columnDefinition = "varchar(400)")
    private String workDesc;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "can_id")
    private Candidate candidate;

    public Experience() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public String getWorkDesc() {
        return workDesc;
    }

    public void setWorkDesc(String workDesc) {
        this.workDesc = workDesc;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", fromDate=" + fromDate +
                ", role='" + role + '\'' +
                ", toDate=" + toDate +
                ", workDesc='" + workDesc + '\'' +
                ", candidate=" + candidate +
                '}';
    }
}
