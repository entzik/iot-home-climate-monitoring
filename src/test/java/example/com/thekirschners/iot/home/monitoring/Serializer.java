package example.com.thekirschners.iot.home.monitoring;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;
import com.thekirschners.iot.home.monitoring.domain.ClimateReading;

import java.time.Instant;

public class Serializer {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JSR310Module());

        ClimateReading cr = new ClimateReading();
        cr.setTenant("test");
        cr.setHome("main");
        cr.setRoom("living room");
        cr.setTimstamp(System.currentTimeMillis());
        cr.setTemperature(23.27);
        cr.setHumidity(28.89);

        String s = objectMapper.writeValueAsString(cr);
        System.out.println("s = " + s);
    }
}
