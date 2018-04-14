package com.thekirschners.iot.home.monitoring;

import java.util.function.Consumer;
import java.util.function.Function;

import com.thekirschners.iot.home.monitoring.domain.ClimateReading;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(Properties.class)
public class Config {

	private Properties props;

	@Autowired
	public Config(Properties props) {
		this.props = props;
	}

	@Bean
	public Consumer<ClimateReading> function() {
		return (reading) -> saveReading(reading);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Config.class, args);
	}

	private void saveReading(ClimateReading reading) {

	}
}
