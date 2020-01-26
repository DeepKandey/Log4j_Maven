package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.BasePage;
import com.util.*;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

@Listeners(AllureReportListener.class)
public class TestHelloExample extends BasePage {

	public BasePage basePage;
	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		basePage = new BasePage();
		driver = basePage.initialize_driver();
	}

	@Test(priority = 1, description = "Simple test case to check Logger")
	@Severity(SeverityLevel.NORMAL)
	@Description("test case to check allure report")
	@Story("Story to use allure report")
	@Step("This is just method for Demo purpose")
	@Link("https://docs.qameta.io/allure/")
	private void runMe() {
		LoggerUtil.logMessage("Checking LoggerUtil abstract class ");
		driver.get("https://www.google.com");
		Assert.assertEquals(false, true);
	} // End of method runMe

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
} // End of class TestHelloExample