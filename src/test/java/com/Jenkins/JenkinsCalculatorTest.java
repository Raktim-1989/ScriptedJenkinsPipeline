package com.Jenkins;

import org.testng.annotations.Test;

public class JenkinsCalculatorTest {

	@Test
	public void getTest()
 {
		// TODO Auto-generated method stub
		JenkinsCalculator obj = new JenkinsCalculator();
		obj.getAddition(20, 10);
		obj.getSubstraction(20, 10);

	}

}
