package com.bdtech.upstests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bdtech.scriptbase.TestBase;

public class ShippingPageTest extends TestBase{
	
	@Test
	public void loginLinkTest() {
		homePage().selectMainMenu("Shipping");
		shippingPage().clickOnCreateAShipmentPackageAndFreightLink();
		shippingPage().clickOnLoginLink();
		
	}
	@Test
	public void switchViewLinkTest() {
		homePage().selectMainMenu("Shipping");
		shippingPage().clickOnCreateAShipmentPackageAndFreightLink();
		shippingPage().clickOnSwitchViewLink();
	}
	
	@Test(priority=1)
	public void getTitleTest() {
		homePage().selectMainMenu("Shipping");
		shippingPage().clickOnCreateAShipmentPackageAndFreightLink();
		String title =shippingPage().verifyShippingPageTitle();
		String expected = "Shipping | UPS";
		Assert.assertEquals(title, expected);
	}
	@Test(priority=2)
	public void getTextTest() {
		homePage().selectMainMenu("Shipping");
		shippingPage().clickOnCreateAShipmentPackageAndFreightLink();
		String text = shippingPage().verifyPageText();
		String expected = "Shipping";
		Assert.assertEquals(text, expected);
	}
	@Test(priority=3)
	public void createShipmentTest1() throws InterruptedException {
		homePage().selectMainMenu("Shipping");
		shippingPage().clickOnCreateAShipmentPackageAndFreightLink();
		shippingPage().createShipment("United States", "BDTech", "Alok Barman", "1216 Libarty Ave", "2F",
				"School", "11376", "Brooklyn", "New York", "test123@gmail.com", "6463792316", "123",
				 true, false, false,false);
	}
	@Test(priority=4)
	public void createShipmentTest2() throws InterruptedException {
		homePage().selectMainMenu("Shipping");
		shippingPage().clickOnCreateAShipmentPackageAndFreightLink();
		shippingPage().createShipment("United States", "BDTech", "Alok Barman", "1216 Libarty Ave", "2F",
				"School", "11376", "Brooklyn", "New York", "test123@gmail.com", "6463792316", "123",
				 false, false, false,false);
	}
	@Test(priority=5)
	public void createShipmentTest3() throws InterruptedException {
		homePage().selectMainMenu("Shipping");
		shippingPage().clickOnCreateAShipmentPackageAndFreightLink();
		shippingPage().createShipment("United States", "BDTech", "Alok Barman", "1216 Libarty Ave", "2F",
				"School", "11376", "Brooklyn", "New York", "test123@gmail.com", "6463792316", "123",
				 true, true, false,false);
		//pop-up text incomplete
	}
	@Test(priority=6)
	public void createShipmentTest4() throws InterruptedException {
		homePage().selectMainMenu("Shipping");
		shippingPage().clickOnCreateAShipmentPackageAndFreightLink();
		shippingPage().createShipment("United States", "BDTech", "Alok Barman", "1216 Libarty Ave", "2F",
				"School", "11376", "Brooklyn", "New York", "test123@gmail.com", "6463792316", "123",
				 true, false, true,true);
		String expected = "";
		String title = signUpPage().verifyPageTitle();
		Assert.assertEquals(title, expected);
		
	}
	@Test(priority=7)
	public void createShipmentWithDifferentReturnAddressTest() throws InterruptedException {
		homePage().selectMainMenu("Shipping");
		shippingPage().clickOnCreateAShipmentPackageAndFreightLink();
		shippingPage().createShipment("United States", "BDTech", "Alok Barman", "1216 Libarty Ave", "2F",
				"School", "11376", "Brooklyn", "New York", "test123@gmail.com", "6463792316", "123",
				 true, true, false,true);
		
	}

}
