package com.iuh.phu.se.models;

import jakarta.persistence.*;

@Entity
@Table(name = "company")
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

    public Company() {
    }

    public Company(long id, String about, String email, String compName, String phone, String webUrl, Address address) {
        this.id = id;
        this.about = about;
        this.email = email;
        this.compName = compName;
        this.phone = phone;
        this.webUrl = webUrl;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", about='" + about + '\'' +
                ", email='" + email + '\'' +
                ", compName='" + compName + '\'' +
                ", phone='" + phone + '\'' +
                ", webUrl='" + webUrl + '\'' +
                ", address=" + address +
                '}';
    }
}
