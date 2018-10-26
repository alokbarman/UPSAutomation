package com.bdtech.pagemodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TrackingPageModel extends ModelBase {

	WebElement trackAndTrackingHistoryLink;
	WebElement trackingPageText;
	WebElement trackingOrNoticeNumber;
	WebElement trackButton;
	WebElement trackByReferenceLink;
	WebElement trackByEmailLink;
	WebElement importTrackingNumberLink;
	WebElement smsTrackingLink;
	WebElement upsMyChoiceLink;
	WebElement quantumViewLink;
	WebElement flexGlobalViewLink;
	WebElement refElement;
	WebElement packageButton;
	WebElement freightButton;
	WebElement mailInnovationsButton;
	WebElement shipmentRefBtn;
	WebElement shipperAccountBtn;
	WebElement destCountry;
	WebElement origCountry;
	WebElement destTerritory;
	WebElement errMessage;
	WebElement destZipOrPostCode;
	WebElement trckButton;
	WebElement shipmentDateFromBtn;
	WebElement shipmentDateToBtn;
	WebElement trackingErrMessage;

	public TrackingPageModel(WebDriver driver) {
		super(driver);

	}

	public WebElement trackAndTrackingHistoryLink() {
		trackAndTrackingHistoryLink = driver.findElement(By.xpath("//a[contains(text(),'Track & Tracking History')]"));
		return trackAndTrackingHistoryLink;

	}

	public WebElement trackAndTrackingPageText() {
		trackingPageText = driver.findElement(By.xpath("//div[@class='page-title_cell']"));
		return trackingPageText;

		// div/h1['Tracking']
	}

	public WebElement trackingOrInfoNumber() {
		trackingOrNoticeNumber = driver.findElement(By.xpath("//*[@id='trackNums']"));
		return trackingOrNoticeNumber;
	}

	public WebElement clickOnTrackButton() {
		trackButton = driver.findElement(By.xpath("//input[@type='submit']"));
		return trackButton;
	}
	public WebElement errorMessage() {
		errMessage = driver.findElement(By.xpath("//div[@class='ups-form_group']//p"));
		return errMessage;
	}

	public WebElement trackByReference() {
		trackByReferenceLink = driver.findElement(By.xpath("//a[contains(text(),'Track by Reference')]"));
		return trackByReferenceLink;
	}

	public WebElement referenceShipmentType() {
		refElement = driver.findElement(By.linkText("Track by Reference"));
		return refElement;
	}

	public WebElement packageRadioButton() {
		packageButton = driver.findElement(By.id("packageRadio"));
		return packageButton;
	}
	public WebElement freightRadioButton() {

		freightButton = driver.findElement(By.id("freightRadio"));
		return freightButton;
	}

	public WebElement mailInnovationsRadioButton() {

		mailInnovationsButton = driver.findElement(By.id("mailRadio"));
		return mailInnovationsButton;
	}
	public WebElement shifmentReference() {//package,freight,mail
		  shipmentRefBtn= driver.findElement(By.xpath("//input[@name='ReferenceNumber']"));
		  return shipmentRefBtn;
	}
	public WebElement selectShipmentDateFrom() {//package,freight,mail
		shipmentDateFromBtn = driver.findElement(By.xpath("//input[@name='FromDatepicker']"));
		return shipmentDateFromBtn;
	}
	public WebElement selectShipmentDateTo() {//package,freight,mail
		shipmentDateToBtn = driver.findElement(By.xpath("//input[@name='ToDatepicker']"));
		return shipmentDateToBtn;
	}
	public WebElement shipperAcc() {//package,freight
		  shipperAccountBtn =driver.findElement(By.xpath("//input[@id='acctNum']"));
		  return shipperAccountBtn;
	}
	public WebElement destinationCountry() {//package
		  destCountry=driver.findElement(By.xpath("//select[@id='DestCountry']"));
		  return destCountry;	  
	}
	public WebElement originTerritory() {//freight
		  origCountry=driver.findElement(By.xpath("//select[@id='CountryOrigin']"));
		  return origCountry;
	}
	public WebElement destinationTerritory() {//freight
		destTerritory = driver.findElement(By.xpath("//select[@id='DestCountry']"));
		return destTerritory;
	}
	public WebElement destinationZipOrPostalCode() {//package,freight,mail
		destZipOrPostCode = driver.findElement(By.xpath("//input[@id='DestinationPostalCode']"));
		return destZipOrPostCode;
	}
	public WebElement clickOnTrckButton() {//package,freight,mail
		trckButton = driver.findElement(By.xpath("//input[@name='trackref.x']"));
		return trckButton;
	}
	public WebElement trackingErrorMessage() {//package,freight
		trackingErrMessage = driver.findElement(By.xpath("//div[@class='secBody']//p[@id='err_nfe']"));
		return trackingErrMessage;
	}

	public WebElement trackByEmail() {
		trackByEmailLink = driver.findElement(By.xpath("//a[contains(text(),'Track by E-mail')]"));
		return trackByEmailLink;
		
		//div[@class='secBody']//div[@id='accordion'] xpath for next page
	}

	public WebElement importTrackingNumber() {
		importTrackingNumberLink = driver.findElement(By.xpath("//a[contains(text(),'Import Tracking Numbers')]"));
		return importTrackingNumberLink;
		
	}

	public WebElement smsTracking() {
		smsTrackingLink = driver.findElement(By.xpath("//a[contains(text(),'SMS Tracking')]"));
		return smsTrackingLink;
	}

	public WebElement upsMyChoice() {
		upsMyChoiceLink = driver.findElement(By.xpath("//a[text()='UPS My Choice']"));
		return upsMyChoiceLink;
	}

	public WebElement quantumView() {
		quantumViewLink = driver.findElement(By.xpath("//a[text()='Quantum View']"));
		return quantumViewLink;
	}

	public WebElement flexGlobalView() {
		flexGlobalViewLink = driver.findElement(By.xpath("//a[text()='Flex Global View']"));
		return flexGlobalViewLink;
	}

}
