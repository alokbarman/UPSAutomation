package com.bdtech.pageaction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.bdtech.pagemodel.HomePageModel;

public class HomePageAction extends ActionBase {

	HomePageModel homePageModel = null;

	public HomePageAction(WebDriver driver) {

		super(driver);

		homePageModel = new HomePageModel(driver);

	}

	public void selectMainMenu(String menu) {
		switch (menu) {

		case "Log In":
			homePageModel.login().click();
			break;
		case "Sign Up":
			homePageModel.signUp().click();
			break;
		case "Locations":
			homePageModel.location().click();
			break;
		case "Tracking":
			homePageModel.tracking().click();
			break;
		case "Shipping":
			homePageModel.shipping().click();
			break;
		case "Services":
			homePageModel.services().click();
			break;
		case "Quick Start":
			homePageModel.quickStart().click();
			break;
		case "United States - English":
			homePageModel.languageToggle().click();
			break;
		case "My Profile":
			homePageModel.myProfile().click();
			break;
		default:
			System.out.println("No Match");
		}
	}

	public void selectProfileSubMenu(String menu, String item) throws InterruptedException {

		homePageModel.myProfile().click();

		Thread.sleep(1000);
		homePageModel.profileSubMenu(item).click();
		Thread.sleep(2000);

	}

	/*
	 * public void clickOnMyProfileMenu(String submenu) { myProfileMenu.click();
	 * 
	 * if(submenu.contains("Sign Up")) { signupSubMenu.click(); }
	 * if(submenu.contains("Log In")) { loginSubMenu.click(); }
	 * if(submenu.contains("Overview")) { overviewSubMenu.click(); }
	 * if(submenu.contains("My Information")) { myInformationSubMenu.click(); }
	 * if(submenu.contains("Addresses")) { addressesSubMenu.click(); }
	 * if(submenu.contains("Payment Options")) { paymentOptionsSubMenu.click(); }
	 * if(submenu.contains("Preferences")) { preferencesSubMenu.click(); }
	 * if(submenu.contains("View & Pay Bill")) { viewAndPayBillSubMenu.click(); }
	 */
	public String getStartWithUps() {
		homePageModel.getStartWithUps().click();
		String text = homePageModel.getStartedText().getText();
		return text;
	}

	public void trackByTrackingNumbers(String number) {
        homePageModel.trackByTrackingNumbers().click();
		homePageModel.trackByTrackingNumbers().sendKeys(number);
		
		homePageModel.clickOnSubmitBtn().click();
		//homePage.clickOnSubmitBtn().sendKeys(Keys.RETURN);
	}

	public String errMessage() {
		homePageModel.trackByTrackingNumbers().click();
		homePageModel.trackByTrackingNumbers().sendKeys("asdf45567h");
		homePageModel.clickOnSubmitBtn().click();
		String msg = homePageModel.errMessage().getText();
		return msg;
	}
	
	/*public void clickOnTrackingLink() {
		homePage.tracking().click();
	}
	public void clickOnShippingLink() {
		homePage.shipping().click();
	}
	public void clickOnServicesLink() {
		homePage.services().click();
	}*/
	
	public void getQuote(String type,String w,String originCountry,String originPost,String destCountry,String destPost,boolean b){
		homePageModel.getQuote().click();
		
		Select select = new Select(homePageModel.shipmentType());
		select.selectByVisibleText(type);
		
		homePageModel.weight().sendKeys(w);
		
		Select select1 = new Select(homePageModel.originCountry());
		select1.selectByVisibleText(originCountry);
		
		homePageModel.originPostCode().sendKeys(originPost);
		
		Select select2 = new Select(homePageModel.destinationCountry());
		select2.selectByVisibleText(destCountry);
		
		homePageModel.destinationPostCode().sendKeys(destPost);
		
		if(b==true) {
		homePageModel.residentialCheckBox().click();
		}
		else {
			
		}
		
		homePageModel.quoteSubmit().click();
	}

}
