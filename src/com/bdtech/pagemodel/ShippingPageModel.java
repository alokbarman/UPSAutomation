package com.bdtech.pagemodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingPageModel extends ModelBase{
	WebElement createAShipmentLink;
	WebElement shippingText;
	WebElement loginLinkButton;
	WebElement switchViewButton;
	WebElement countryOrTerritoryButton;
	WebElement countryOrTerritoryButton2;
	WebElement companyOrNameButton;
	WebElement companyOrNameButton2;
	WebElement contactNameButton;
	WebElement contactNameButton2;
	WebElement streetAddressButton;
	WebElement streetAddressButton2;
	WebElement appartmentUnitFloorButton;
	WebElement appartmentUnitFloorButton2;
	WebElement departmentButton;
	WebElement departmentButton2;
	WebElement zipCodeButton;
	WebElement zipCodeButton2;
	WebElement cityButton;
	WebElement cityButton2;
	WebElement stateButton;
	WebElement stateButton2;
	WebElement emailAddress;
	WebElement emailAddress2;
	WebElement telephoneNumber;
	WebElement telephoneNumber2;
	WebElement telephoneExtNumber;
	WebElement telephoneExtNumber2;
	WebElement updateCheckBox;
	WebElement updateCheckBox2;
	WebElement differentAddressSwitch;
	WebElement continueButton;
	WebElement cancelShipmentButton;
	WebElement yesButton;
	WebElement noButton;
	WebElement calculateTimeAndCostLink;

	public ShippingPageModel(WebDriver driver) {
		super(driver);
		
	}
	public WebElement createAShipmentPackageAndFreight() {
		createAShipmentLink = driver.findElement(By.xpath("//a[contains(text(),'Create a Shipment:')]"));
		return createAShipmentLink;
	}
	public WebElement shippingPageText() {
		shippingText = driver.findElement(By.xpath("//div[@class='page-title_cell']"));
		return shippingText;	
	}
	public WebElement loginLink() {
		loginLinkButton = driver.findElement(By.xpath("//a[@id='nbsInfoBannerLogInLink']"));
		return loginLinkButton;
	}
	public WebElement switchViewLink() {
		switchViewButton = driver.findElement(By.xpath("//a[@id='nbsInfoBannerSwitchViewLink']"));
		return switchViewButton;
	}
	public WebElement countryOrTerritory() {
		countryOrTerritoryButton = driver.findElement(By.xpath("//select[@id='origincountry']"));
		return countryOrTerritoryButton;
	}
	public WebElement companyOrName() {
		companyOrNameButton = driver.findElement(By.xpath("//input[@id='originname']"));
		return companyOrNameButton;
	}
	public WebElement contactName() {
		contactNameButton = driver.findElement(By.xpath("//input[@id='origincontactName']"));
		return contactNameButton;
	}
	public WebElement streetAddress() {
		streetAddressButton = driver.findElement(By.xpath("//input[@id='originaddress1']"));
		return streetAddressButton;
	}
	public WebElement appartmentSuiteUnitFloor() {
		appartmentUnitFloorButton = driver.findElement(By.xpath("//input[@id='originaddress2']"));
		return appartmentUnitFloorButton;
	}
	public WebElement departmentCo() {
		departmentButton = driver.findElement(By.xpath("//input[@id='originaddress3']"));
		return departmentButton;
	}
	public WebElement zipCode() {
		zipCodeButton = driver.findElement(By.xpath("//input[@id='originpostal']"));
		return zipCodeButton;
	}
	public WebElement city() {
		cityButton = driver.findElement(By.xpath("//input[@id='origincity']"));
		return cityButton;
	}
	public WebElement state() {
		stateButton = driver.findElement(By.xpath("//select[@id='originstate']"));
		return stateButton;
	}
	public WebElement email() {
		emailAddress = driver.findElement(By.xpath("//input[@id='originemail']"));
		return emailAddress;
	}
	public WebElement telephone() {
		telephoneNumber = driver.findElement(By.xpath("//input[@id='originphone']"));
		return telephoneNumber;
	}
	public WebElement telephoneExt() {
		telephoneExtNumber = driver.findElement(By.xpath("//input[@id='originextension']"));
		return telephoneExtNumber;
	}
	public WebElement shipmentUpdate() {
		updateCheckBox = driver.findElement(By.xpath("//input[@id='originnbsAgentEmailCheckbox']"));
		return updateCheckBox;
	}
	public WebElement differentReturnAddress() {
		differentAddressSwitch = driver.findElement(By.xpath("//input[@id='returnSwitch']"));
		return differentAddressSwitch;
	}
	
	//different return address
	
	public WebElement countryOrTerritory2() {
		countryOrTerritoryButton2 = driver.findElement(By.xpath("//select[@id='returncountry']"));
		return countryOrTerritoryButton2;
	}
	public WebElement companyOrName2() {
		companyOrNameButton2 = driver.findElement(By.xpath("//input[@id='returnname']"));
		return companyOrNameButton2;
	}
	public WebElement contactName2() {
		contactNameButton2 = driver.findElement(By.xpath("//input[@id='returncontactName']"));
		return contactNameButton2;
	}
	public WebElement streetAddress2() {
		streetAddressButton2 = driver.findElement(By.xpath("//input[@id='returnaddress1']"));
		return streetAddressButton2;
	}
	public WebElement appartmentSuiteUnitFloor2() {
		appartmentUnitFloorButton2 = driver.findElement(By.xpath("//input[@id='returnaddress2']"));
		return appartmentUnitFloorButton2;
	}
	public WebElement departmentCo2() {
		departmentButton2 = driver.findElement(By.xpath("//input[@id='returnaddress3']"));
		return departmentButton2;
	}
	public WebElement zipCode2() {
		zipCodeButton2 = driver.findElement(By.xpath("//input[@id='returnpostal']"));
		return zipCodeButton2;
	}
	public WebElement city2() {
		cityButton2 = driver.findElement(By.xpath("//input[@id='returncity']"));
		return cityButton2;
	}
	public WebElement state2() {
		stateButton2 = driver.findElement(By.xpath("//select[@id='returnstate']"));
		return stateButton2;
	}
	public WebElement email2() {
		emailAddress2 = driver.findElement(By.xpath("//input[@id='returnemail']"));
		return emailAddress2;
	}
	public WebElement telephone2() {
		telephoneNumber2 = driver.findElement(By.xpath("//input[@id='returnphone']"));
		return telephoneNumber2;
	}
	public WebElement telephoneExt2() {
		telephoneExtNumber2 = driver.findElement(By.xpath("//input[@id='returnextension']"));
		return telephoneExtNumber2;
	}
	public WebElement shipmentUpdate2() {
		updateCheckBox2 = driver.findElement(By.xpath("//input[@id='returnnbsAgentEmailCheckbox']"));
		return updateCheckBox2;
	}
	
	
	
	public WebElement continuePage() {
		continueButton = driver.findElement(By.xpath("//button[@id='nbsBackForwardNavigationContinueButton']"));
		return continueButton;
	}
	public WebElement cancelShipment() {
		cancelShipmentButton = driver.findElement(By.xpath("//button[@id='nbsBackForwardNavigationCancelShipmentButton']"));
		return cancelShipmentButton;
	}
	public WebElement cancelYesButton() {
		yesButton = driver.findElement(By.xpath("//button[@id='nbsCancelShipmentWarningYes']"));
		return yesButton;
	}
	public WebElement cancelNoButton() {
		noButton = driver.findElement(By.xpath("//button[@id='nbsCancelShipmentWarningYes']"));
		return noButton;
	}
	
	//button[@id='nbsCancelShipmentWarningYes']   //button[@id='nbsCancelShipmentWarningNo']
	
	// calculate time and cost
	
	public WebElement calculateTimeAndCost() {
		calculateTimeAndCostLink = driver.findElement(By.xpath("//a[@class='ups-analytics' and text()='Calculate Time & Cost']"));
		return calculateTimeAndCostLink;
	}

}
