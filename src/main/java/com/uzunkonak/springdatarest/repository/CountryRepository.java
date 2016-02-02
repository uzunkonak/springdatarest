package com.uzunkonak.springdatarest.repository;

import com.uzunkonak.springdatarest.domain.Country;
import com.uzunkonak.springdatarest.projection.CountryProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by cuzunkon on 2/3/2016.
 */
@RepositoryRestResource(collectionResourceRel = "countries", path = "countries", excerptProjection = CountryProjection.class)
public interface CountryRepository extends JpaRepository<Country, String> {
}
