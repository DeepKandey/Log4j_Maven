package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BasePage;
import com.util.LoggerUtil;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class TestHelloExample extends BasePage {

	public BasePage basePage;
	private WebDriver driver;

	@BeforeMethod
	private void setUp() {
		basePage = new BasePage();
		driver = basePage.initialize_driver();
	}

	@Test(priority = 1, description = "Test to check Logger Utility")
	@Severity(SeverityLevel.NORMAL)
	@Description("Description of the test case - Allure")
	@Story("Test case written for Story - Allure")
	@Step("Step at test Body level - Allure")
	@Link("https://docs.qameta.io/allure/")
	private void runMe() {
		LoggerUtil.logMessage("Logs wriiten using Logger Utility");
		Allure.step("Logging steps for action performed- Navigating to Google site");
		driver.get("https://www.google.com");
		Assert.assertEquals(false, true);
	} // End of method runMe

	@AfterMethod
	private void tearDown() {
		driver.quit();
	}
} // End of class TestHelloExample