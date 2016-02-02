package com.uzunkonak.springdatarest.projection;

import com.uzunkonak.springdatarest.domain.City;
import com.uzunkonak.springdatarest.domain.Country;
import org.springframework.data.rest.core.config.Projection;

/**
 * Created by cuzunkon on 2/2/2016.
 */
@Projection(types = City.class)
public interface CityProjection {

    Long getID();

    String getName();

    String getDistrict();

    Long getPopulation();
}
