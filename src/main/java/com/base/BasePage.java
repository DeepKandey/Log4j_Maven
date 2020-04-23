package com.base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	public WebDriver driver;
	public Properties prop;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

	public WebDriver initialize_driver() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/deepa/Downloads/Browser Drivers/Chrome Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true"); // To suppress the Chrome logs on console
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		tdriver.set(driver);
		return getDriver();
	} // End of method initialize_driver

	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	} // End of method getDriver
} // End of class BasePage