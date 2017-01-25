package com.OnetrustAutomation.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnetrustContactRegistration {
	WebDriver driver;
	WebDriverWait wait;

	@Before
	public void initialize() {

		System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
		driver = new ChromeDriver();
		wait=new WebDriverWait(driver, 90);
		driver.manage().window().maximize();

	}

	@Test
	public void test() throws Exception {
		driver.get("https://onetrust.com/");
		CommonFunctions cf=new CommonFunctions();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Contact']"))).click();;
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'First Name')]"))).sendKeys("One");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Last Name')]"))).sendKeys("trust");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Email')]"))).sendKeys("onetrust@mailinator.com");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Company')]"))).sendKeys("OnetrustAutomation");
		wait.until(ExpectedConditions.elementToBeClickable(By.name("phone"))).sendKeys("5555551234");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[contains(@placeholder,'Comments')]"))).sendKeys("OnetrustAutomation Assignment");
		
		cf.getscreenshot(driver);

	}

	@After
	public void myTestMethod() {
		driver.quit();
	}
}
