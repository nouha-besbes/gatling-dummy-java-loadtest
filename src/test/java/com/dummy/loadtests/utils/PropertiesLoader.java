package com.dummy.loadtests.utils;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {

	public PropertiesLoader() {
		// TODO Auto-generated constructor stub
	}

	public static final String DUMMY_URL;
	static {
		var properties = new Properties();
		var fileName = "application.properties";
		try (InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName)) {
			properties.load(inputStream);
			DUMMY_URL = properties.getProperty("dummy.url");
		} catch (Exception e) {
			throw new ExceptionInInitializerError(e);
		}
	}
}
