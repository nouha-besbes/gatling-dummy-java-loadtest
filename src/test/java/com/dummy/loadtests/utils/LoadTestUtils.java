package com.dummy.loadtests.utils;

public class LoadTestUtils {

	public static final int nbUsers;
	public static final long ramp;

	static {
		nbUsers = Integer.getInteger("users", 1);
		ramp = Long.getLong("ramp", 10);
	}

}
