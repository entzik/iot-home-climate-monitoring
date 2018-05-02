package com.thekirschners.iot.home.monitoring.domain;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "climate_reading", indexes = {
        @Index(columnList = "tenant,home", unique = true)
})
public class ClimateReading {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {
                    @Parameter(
                            name = "uuid_gen_strategy_class",
                            value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
                    )
            }
    )
    @Column(name = "id", updatable = false, nullable = false, length = 64)
    private String id;

    @Column(name = "tenant", updatable = false, nullable = false, length = 64)
    private String tenant;

    @Column(name = "home", updatable = false, nullable = false, length = 64)
    private String home;

    @Column(name = "room", updatable = false, nullable = false, length = 64)
    private String room;

    @Column(name="timestamp", nullable = false)
    private long timstamp;

    @Column(name="temperature", updatable = false, nullable = false)
    private double temperature;

    @Column(name="humidity", updatable = false, nullable = false)
    private double humidity;

    public ClimateReading() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public long getTimstamp() {
        return timstamp;
    }

    public void setTimstamp(long timstamp) {
        this.timstamp = timstamp;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
}
