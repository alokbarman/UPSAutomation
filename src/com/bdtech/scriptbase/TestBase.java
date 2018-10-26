package com.bdtech.scriptbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.bdtech.pageaction.HomePageAction;
import com.bdtech.pageaction.LogInPageAction;
import com.bdtech.pageaction.ShippingPageAction;
import com.bdtech.pageaction.SignUpPageAction;
import com.bdtech.pageaction.TrackingPageAction;

public class TestBase {

	WebDriver driver;
	//WebDriverWait wait = new WebDriverWait(driver,10);

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("Open Firefox");

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");

		driver = new FirefoxDriver();
		
		//driver.get("https://www.spicejet.com/");

		driver.get("https://www.ups.com/us/en/Home.page");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
		System.out.println("My test is completed");
		
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}
	
	public SignUpPageAction signUpPage() {
		return new SignUpPageAction(driver);
	}
	
	public HomePageAction homePage() {
		return new HomePageAction(driver);
	}
	public LogInPageAction loginPage() {
		return new LogInPageAction(driver);
	}
	public TrackingPageAction trackingPage() {
		return new TrackingPageAction(driver);
	}
	public ShippingPageAction shippingPage() {
		return new ShippingPageAction(driver);
	}

}
