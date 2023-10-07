package com.iuh.phu.se.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = {"id"})

@Entity
@Table(name = "address")

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id",columnDefinition = "bigint(20)")
    private long id;
    @Column(columnDefinition = "varchar(150)")
    private String street;
    @Column(columnDefinition = "varchar(50)")
    private String city;

    @Column(columnDefinition = "smaillint(6)")
    private short country;

    @Column(columnDefinition = "varchar(20)")
    private String number;

    @Column(name = "zipcode",columnDefinition = "varchar(7)")
    private String zipCode;

    public Address() {
    }

    public Address(long id, String street, String city, short country, String number, String zipCode) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.country = country;
        this.number = number;
        this.zipCode = zipCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public short getCountry() {
        return country;
    }

    public void setCountry(short country) {
        this.country = country;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country=" + country +
                ", number='" + number + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
