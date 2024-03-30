package com.dummy.loadtests.simulations;

import java.time.Duration;

import com.dummy.loadtests.scenarios.CreateNewEmployee;
import com.dummy.loadtests.utils.LoadTestUtils;

import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;

public class ExecuteNewEmployeeTestSimulation extends Simulation {

	{
		setUp(createNewEmployee("pom")
				.injectOpen(CoreDsl.rampUsers(LoadTestUtils.nbUsers).during(Duration.ofMinutes(LoadTestUtils.ramp))));
	}

	ScenarioBuilder createNewEmployee(String scenarioName) {
		return CoreDsl.scenario(scenarioName).exec(CreateNewEmployee.createNewEmployee());
	}
}
