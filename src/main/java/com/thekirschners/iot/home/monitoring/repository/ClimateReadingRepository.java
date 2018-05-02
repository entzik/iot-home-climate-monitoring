package com.thekirschners.iot.home.monitoring.repository;

import com.thekirschners.iot.home.monitoring.domain.ClimateReading;
import org.springframework.data.repository.CrudRepository;

public interface ClimateReadingRepository extends CrudRepository<ClimateReading, String> {

}
