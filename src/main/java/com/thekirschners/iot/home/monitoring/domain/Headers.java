package com.thekirschners.iot.home.monitoring.domain;

public class Headers {
    String someHeader1;
    String someHeader2;

    public Headers() {
        someHeader1 = "value1";
        someHeader2 = "value2";
    }

    public Headers(String someHeader1, String someHeader2) {
        this.someHeader1 = someHeader1;
        this.someHeader2 = someHeader2;
    }

    public String getSomeHeader1() {
        return someHeader1;
    }

    public void setSomeHeader1(String someHeader1) {
        this.someHeader1 = someHeader1;
    }

    public String getSomeHeader2() {
        return someHeader2;
    }

    public void setSomeHeader2(String someHeader2) {
        this.someHeader2 = someHeader2;
    }
}
