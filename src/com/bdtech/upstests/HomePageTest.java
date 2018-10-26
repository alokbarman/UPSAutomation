package com.bdtech.upstests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bdtech.scriptbase.TestBase;

public class HomePageTest extends TestBase {
	
	@Test
	public void loginTest() {
		homePage().selectMainMenu("Log In");
		//homePage().clikOnLoginBtn();
	}
	@Test
	public void signUpTest() {
		homePage().selectMainMenu("Sign Up");	
	}
	@Test
	public void LocationsTest() {
		homePage().selectMainMenu("Locations");
	}
	@Test
	public void trackingtest() {
		homePage().selectMainMenu("Tracking");
	}
	@Test
	public void shippingTest() {
		homePage().selectMainMenu("Shipping");
	}
	@Test
	public void servicesTest() {
		homePage().selectMainMenu("Services");
	}
	
	@Test
	public void languageToggleTest() {
		homePage().selectMainMenu("United States - English");
	}
	@Test
	public void myProfileTest() {
		homePage().selectMainMenu("My Profile");
	}
	@Test
	public void quickStartWithUpsTest() {     // test fail
		String text = homePage().getStartWithUps();
		String expected = "Shipping Needs: Get Started with UPS";
		
		Assert.assertTrue(text.contains(expected));
	}
	@Test
	public void trackByTrackingNumberTest() {
		homePage().trackByTrackingNumbers("123ert67nb");
		
	}
	@Test
	public void errorMessageTest() {
		String expected = "UPS could not locate the shipment ";
		String str = homePage().errMessage();
		Assert.assertTrue(str.contains(expected));
	}
	
	@Test
	public void getUPSMessageTest() {
		String expected = "Get Started with UPS";
		String text = homePage().getStartWithUps();
		Assert.assertEquals(text, expected);
		Assert.assertTrue(text.contains(expected));
		Assert.assertTrue(text.contentEquals(expected));
	}
	@Test
	public void getQuoteTest() {
		homePage().getQuote("Package", "3", "United States", "11377", "United States", "11373", true);
	}
}