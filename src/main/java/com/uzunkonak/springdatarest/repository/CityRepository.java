package com.uzunkonak.springdatarest.repository;

import com.uzunkonak.springdatarest.domain.City;
import com.uzunkonak.springdatarest.projection.CityProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by cuzunkon on 2/2/2016.
 */
@RepositoryRestResource(collectionResourceRel = "cities", path = "cities", excerptProjection = CityProjection.class)
public interface CityRepository extends JpaRepository<City, Long> {
}
