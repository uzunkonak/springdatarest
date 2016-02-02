package com.uzunkonak.springdatarest.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by cuzunkon on 2/2/2016.
 */
@Entity
@Table(name = "City")
public class City implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long ID;

    @Column(nullable = false)
    private String Name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Country_Code",referencedColumnName = "Code")
    private Country Country;

    @Column(nullable = false)
    private String District;

    @Column(nullable = false)
    private Long Population;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Country getCountry() {
        return Country;
    }

    public void setCountry(Country country) {
        Country = country;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public Long getPopulation() {
        return Population;
    }

    public void setPopulation(Long population) {
        Population = population;
    }
}
