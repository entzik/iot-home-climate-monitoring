package com.thekirschners.iot.home.monitoring.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class ClimateResponse {
    boolean isBase64Encoded;

    int statusCode;
    Headers headers;
    ClimateReading body;

    public ClimateResponse() {
    }

    public ClimateResponse(boolean isBase64Encoded, int statusCode, Headers headers, ClimateReading body) {
        this.isBase64Encoded = isBase64Encoded;
        this.statusCode = statusCode;
        this.headers = headers;
        this.body = body;
    }

    @JsonProperty("isBase64Encoded")
    public boolean isBase64Encoded() {
        return isBase64Encoded;
    }

    public void setBase64Encoded(boolean base64Encoded) {
        isBase64Encoded = base64Encoded;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Headers getHeaders() {
        return headers;
    }

    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    public ClimateReading getBody() {
        return body;
    }

    public void setBody(ClimateReading body) {
        this.body = body;
    }
}
