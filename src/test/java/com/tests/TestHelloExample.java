package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.LoggerUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class TestHelloExample {

	@Test(priority = 1, description = "Simple test case to check Logger")
	@Severity(SeverityLevel.NORMAL)
	@Description("test case to check allure report")
	@Story("Story to use allure report")
	@Step("This is just demo method")
	private void runMe() {
		LoggerUtil.logMessage("Checking LoggerUtil abstract class ");
		Assert.assertEquals(false, false);
	}
}