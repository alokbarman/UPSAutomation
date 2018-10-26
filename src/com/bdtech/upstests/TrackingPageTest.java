package com.bdtech.upstests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bdtech.scriptbase.TestBase;

public class TrackingPageTest extends TestBase {

	@Test(priority = 1)
	public void pageTitleTest() {
		homePage().selectMainMenu("Tracking");
		trackingPage().clickOnTrackAndTrackingHistLink();
		String title = trackingPage().getPageTitle();
		Assert.assertEquals(title, "Tracking: UPS", "Title is not displayed");
		// Assert.assertEquals(title, "Tracking: UPS");
	}

	@Test(priority = 2)
	public void verifyPageLogoTest() {
		homePage().selectMainMenu("Tracking");
		trackingPage().clickOnTrackAndTrackingHistLink();
		String actual = trackingPage().getPageText();
		String expected = "Tracking";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 3)
	public void trackBySingleNumber() {
		homePage().selectMainMenu("Tracking");
		trackingPage().clickOnTrackAndTrackingHistLink();

		String text = trackingPage().trackingByNumber("5");
		String expected = "The number you entered is not a valid tracking number";
		Assert.assertTrue(text.contains(expected));
	}

	@Test(priority = 4)
	public void trackByFiveNumbers() {
		homePage().selectMainMenu("Tracking");
		trackingPage().clickOnTrackAndTrackingHistLink();
		trackingPage().trackingByNumber("4568g");
		String text = trackingPage().trackingByNumber("56789");
		String expected = "The number you entered is not a valid tracking number";
		Assert.assertTrue(text.contains(expected));
	}

	@Test(priority = 5)
	public void trackBy25Number() {
		homePage().selectMainMenu("Tracking");
		trackingPage().clickOnTrackAndTrackingHistLink();
		trackingPage().trackingByNumber("qwertyuiop1234567890cvbnm");
		String text = trackingPage().trackingByNumber("5");
		String expected = "The number you entered is not a valid tracking number";
		Assert.assertTrue(text.contains(expected));

	}

	@Test(priority = 6)
	public void trackBy26Number() {
		homePage().selectMainMenu("Tracking");
		trackingPage().clickOnTrackAndTrackingHistLink();
		trackingPage().trackingByNumber("1234567890qwertyuiopasdfgh");
		String text = trackingPage().trackingByNumber("1234567890qwertyuiopasdfgh");
		String expected = "The number you entered is not a valid tracking number";
		Assert.assertTrue(text.contains(expected));

	}

	@Test(priority = 7)
	public void trackByPackageReferenceTest() throws InterruptedException {
		homePage().selectMainMenu("Tracking");
		trackingPage().clickOnTrackAndTrackingHistLink();
		trackingPage().selectMenu("Track by Reference");
		trackingPage().selectRadioButton("Package");

		trackingPage().trackByPackageReference("gift for Mom.", "05/28/2018", "06/15/2018", "9876543098",
				"United States", "11377");
	}

	@Test(priority = 8)//pop-up handling needed
	public void trackByReferenceWithWrongPackageInfo() throws InterruptedException {
		homePage().selectMainMenu("Tracking");
		trackingPage().clickOnTrackAndTrackingHistLink();
		trackingPage().selectMenu("Track by Reference");
		trackingPage().selectRadioButton("Package");
		String text = trackingPage().trackByPackageReference("gift for Mom.", "05/28/2018", "06/15/2018",
				"9876543098", "United States", "11377");
		

		String expected = "UPS could not locate the shipment details for your request.";
		Assert.assertTrue(text.contains(expected));
	}
	@Test(priority = 9)
	public void trackByFreightReferenceTest() {
		homePage().selectMainMenu("Tracking");
		trackingPage().clickOnTrackAndTrackingHistLink();
		trackingPage().selectMenu("Track by Reference");
		trackingPage().selectRadioButton("Freight");
		String text = trackingPage().trackByFreightReference("gift for Mom.", "05/28/2018", "06/15/2018",
				"9876543098", "United States","United States", "11377");

		String expected = "UPS could not locate the shipment details for your request.";
		Assert.assertTrue(text.contains(expected));
	}

	@Test(priority = 10)
	public void trackByMailInnovationsReferenceTest() {
		homePage().selectMainMenu("Tracking");
		trackingPage().clickOnTrackAndTrackingHistLink();
		trackingPage().selectMenu("Track by Reference");
		trackingPage().selectRadioButton("Mail Innovations");
		String text = trackingPage().trackByMailInnovationsReference("asder45567", "05/25/2018", "06/10/2018", "11432");
		
		String expected = "UPS could not locate the shipment details for your request. Verify your ";
		Assert.assertTrue(text.contains(expected));
	}

}
