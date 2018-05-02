package com.thekirschners.iot.home.monitoring;

import java.util.function.Function;

import com.thekirschners.iot.home.monitoring.domain.ClimateReading;
import com.thekirschners.iot.home.monitoring.repository.ClimateReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    @Autowired
    ClimateReadingRepository climateReadingRepository;

    @Bean(name = "saveReadings")
    public Function<ClimateReading, ClimateReading> saveReadings() {
        return (reading) -> climateReadingRepository.save(reading);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
