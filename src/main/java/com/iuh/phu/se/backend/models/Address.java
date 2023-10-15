package com.iuh.phu.se.backend.models;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(of = {"id"})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address")
@Builder
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id",columnDefinition = "bigint(20)")
    private long id;
    @Column(columnDefinition = "varchar(150)")
    private String street;
    @Column(columnDefinition = "varchar(50)")
    private String city;

    @Column(name = "country", nullable = false)
    private CountryCode country;

    @Column(columnDefinition = "varchar(20)")
    private String number;

    @Column(name = "zipcode",columnDefinition = "varchar(7)")
    private String zipCode;

    public Address(String street, String city, CountryCode country, String number, String zipCode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.number = number;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return
                 street + '\'' +
               city + '\'' +
                 country +
               number + '\'' +
               zipCode + '\'' ;

    }
}
