package com.uzunkonak.springdatarest.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by cuzunkon on 2/2/2016.
 */
@Entity
@Table(name = "Country")
@Embeddable
public class Country implements Serializable {

    private static final long serialVersionUID = 1L;

    public Country() {
    }

    public Country(String code) {
        Code = code;
    }

    @Id
    @Column(nullable = false)
    private String Code;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String Continent;

    @Column(nullable = false)
    private String Region;

    @Column(nullable = false)
    private Double Surface_Area;

    @Column(nullable = false)
    private Integer Indep_Year;

    @Column(nullable = false)
    private Long Population;

    @Column(nullable = false)
    private Double Life_Expectancy;

    @Column(nullable = false)
    private Double GNP;

    @Column(nullable = false)
    private Double GNP_Old;

    @Column(nullable = false)
    private String Local_Name;

    @Column(nullable = false)
    private String Government_Form;

    @Column(nullable = false)
    private String Head_Of_State;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Capital",referencedColumnName = "ID")
    private City Capital;

    @Column(nullable = false)
    private String Code2;

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String continent) {
        Continent = continent;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public Double getSurface_Area() {
        return Surface_Area;
    }

    public void setSurface_Area(Double surface_Area) {
        Surface_Area = surface_Area;
    }

    public Integer getIndep_Year() {
        return Indep_Year;
    }

    public void setIndep_Year(Integer indep_Year) {
        Indep_Year = indep_Year;
    }

    public Long getPopulation() {
        return Population;
    }

    public void setPopulation(Long population) {
        Population = population;
    }

    public Double getLife_Expectancy() {
        return Life_Expectancy;
    }

    public void setLife_Expectancy(Double life_Expectancy) {
        Life_Expectancy = life_Expectancy;
    }

    public Double getGNP() {
        return GNP;
    }

    public void setGNP(Double GNP) {
        this.GNP = GNP;
    }

    public Double getGNP_Old() {
        return GNP_Old;
    }

    public void setGNP_Old(Double GNP_Old) {
        this.GNP_Old = GNP_Old;
    }

    public String getLocal_Name() {
        return Local_Name;
    }

    public void setLocal_Name(String local_Name) {
        Local_Name = local_Name;
    }

    public String getGovernment_Form() {
        return Government_Form;
    }

    public void setGovernment_Form(String government_Form) {
        Government_Form = government_Form;
    }

    public String getHead_Of_State() {
        return Head_Of_State;
    }

    public void setHead_Of_State(String head_Of_State) {
        Head_Of_State = head_Of_State;
    }

    public City getCapital() {
        return Capital;
    }

    public void setCapital(City capital) {
        Capital = capital;
    }

    public String getCode2() {
        return Code2;
    }

    public void setCode2(String code2) {
        Code2 = code2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return Code != null ? Code.equals(country.Code) : country.Code == null;

    }

    @Override
    public int hashCode() {
        return Code != null ? Code.hashCode() : 0;
    }
}
