package com.dummy.loadtests.scenarios;

import static io.gatling.javaapi.core.CoreDsl.ElFileBody;
import static io.gatling.javaapi.core.CoreDsl.exec;
import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;

import com.dummy.loadtests.utils.PropertiesLoader;

import io.gatling.javaapi.core.ChainBuilder;

public class CreateNewEmployee {

	private CreateNewEmployee() {
		// TODO Auto-generated constructor stub
	}

	public static ChainBuilder createNewEmployee() {
		return exec(http("Create Employee Api").post(PropertiesLoader.DUMMY_URL + "/create")
				.body(ElFileBody("payload/newEmployee.json")).asJson().check(status().is(200)));

	}
}
