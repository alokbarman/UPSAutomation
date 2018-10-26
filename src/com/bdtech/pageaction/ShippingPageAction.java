package com.bdtech.pageaction;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.bdtech.pagemodel.HomePageModel;
import com.bdtech.pagemodel.ShippingPageModel;

public class ShippingPageAction extends ActionBase {

	ShippingPageModel shippingPageModel;

	public ShippingPageAction(WebDriver driver) {
		super(driver);
		shippingPageModel = new ShippingPageModel(driver);

	}

	public void clickOnCreateAShipmentPackageAndFreightLink() {

		shippingPageModel.createAShipmentPackageAndFreight().click();
	}

	public String verifyShippingPageTitle() {
		return driver.getTitle();
	}

	public String verifyPageText() {
		String text = shippingPageModel.shippingPageText().getText();
		return text;
	}
	public void clickOnLoginLink() {
		shippingPageModel.loginLink().click();
	}
	public void clickOnSwitchViewLink() {
		shippingPageModel.switchViewLink().click();
	}
	public void createShipment(String country,String companyName,String contactName,String street,String appartment,
			String department,String zipCode,String city,String state,String email,String phone,
			String phoneExt,boolean shipmentUpdate,boolean diffRtnAddress,boolean shipmentCancel,boolean yesNoButton) throws InterruptedException {
		
		Select countryName = new Select(shippingPageModel.countryOrTerritory());
		countryName.selectByVisibleText(country);
		shippingPageModel.companyOrName().sendKeys(companyName);
		shippingPageModel.contactName().sendKeys(contactName);
		shippingPageModel.streetAddress().sendKeys(street);
		shippingPageModel.appartmentSuiteUnitFloor().sendKeys(appartment);
		shippingPageModel.departmentCo().sendKeys(department);
		shippingPageModel.zipCode().sendKeys(zipCode);
		shippingPageModel.city().sendKeys(city);
		Select stateName = new Select(shippingPageModel.state());
		stateName.selectByVisibleText(state);
		shippingPageModel.email().sendKeys(email);
		shippingPageModel.telephone().sendKeys(phone);
		shippingPageModel.telephoneExt().sendKeys(phoneExt);
		if(shipmentUpdate == true) {
			shippingPageModel.shipmentUpdate().click();
		}
		if(diffRtnAddress == true) {
			shippingPageModel.differentReturnAddress().click();
			
			//public String returnAddress(String country2) {
				
			Select countryName1 = new Select(shippingPageModel.countryOrTerritory2());
			countryName1.selectByVisibleText(country);
			shippingPageModel.companyOrName2().sendKeys(companyName);
			shippingPageModel.contactName2().sendKeys(contactName);
			shippingPageModel.streetAddress2().sendKeys(street);
			shippingPageModel.appartmentSuiteUnitFloor2().sendKeys(appartment);
			shippingPageModel.departmentCo2().sendKeys(department);
			shippingPageModel.zipCode2().sendKeys(zipCode);
			shippingPageModel.city2().sendKeys(city);
			Select stateName1 = new Select(shippingPageModel.state2());
			stateName1.selectByVisibleText(state);
			shippingPageModel.email2().sendKeys(email);
			shippingPageModel.telephone2().sendKeys(phone);
			shippingPageModel.telephoneExt2().sendKeys(phoneExt);
			}
			if(shipmentUpdate == true) {
				shippingPageModel.shipmentUpdate().click();
			}
		//}	
		if(shipmentCancel == true) {
			shippingPageModel.cancelShipment().click();
			Thread.sleep(3000);
			if(yesNoButton==true) {
			//Alert alert = driver.switchTo().alert();
			shippingPageModel.cancelYesButton().click();
			}
			/*Set<String> handeler = driver.getWindowHandles();
			Iterator<String> it = handeler.iterator();
			String parentWindowId = it.next();
			System.out.println("Parent window id: "+parentWindowId);
			String childWindowId = it.next();
			System.out.println("Child window id: "+childWindowId);
			driver.switchTo().window(childWindowId);
			Thread.sleep(2000);
			System.out.println("Child window popup title "+driver.getTitle());
			driver.close();
			driver.switchTo().window(parentWindowId);
			Thread.sleep(2000);
			System.out.println("Parent window title "+parentWindowId);*/
			
			/*Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			String text = alert.getText();
			alert.dismiss();*/
		}
		
	}
	
		
	}
	


