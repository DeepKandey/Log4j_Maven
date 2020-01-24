package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BasePage;
import com.utils.AllureReportListener;
import com.utils.LoggerUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

@Listeners(AllureReportListener.class)
public class TestHelloExample extends BasePage {

	public BasePage basePage;
	public WebDriver driver;

	@Test(priority = 1, description = "Simple test case to check Logger")
	@Severity(SeverityLevel.NORMAL)
	@Description("test case to check allure report")
	@Story("Story to use allure report")
	@Step("This is just demo method")
	private void runMe() {
		LoggerUtil.logMessage("Checking LoggerUtil abstract class ");
		basePage = new BasePage();
		driver = basePage.initialize_driver();
		driver.get("https://www.google.com");
		Assert.assertEquals(false, true);
		driver.quit();
	}
}