package com.uzunkonak.springdatarest.projection;

import com.uzunkonak.springdatarest.domain.City;
import com.uzunkonak.springdatarest.domain.Country;
import org.springframework.data.rest.core.config.Projection;

/**
 * Created by cuzunkon on 2/3/2016.
 */
@Projection(types = Country.class)
public interface CountryProjection{

    String getCode();

    String getName();

    String getContinent();

    String getRegion();

    String getSurface_Area();

    Integer getIndep_Year();

    Long getPopulation();

    Double getLife_Expectancy();

    Double getGNP();

    Double getGNP_Old();

    String getLocal_Name();

    String getGovernment_Form();

    String getHead_Of_State();

    String getCode2();

}
