

package com.thekirschners.iot.home.monitoring;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app")
public class Properties {

	public String foo;

	public String getFoo() {
		return foo;
	}

	public void setFoo(String foo) {
		this.foo = foo;
	}
}
