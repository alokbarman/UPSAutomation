package com.bdtech.pagemodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageModel extends ModelBase {
	
	protected WebElement loginBtn = null;
	protected WebElement signUpBtn = null;
	protected WebElement locationBtn = null;
	protected WebElement trackingBtn = null;
	protected WebElement shippingBtn = null;
	protected WebElement servicesMenu = null;
	protected WebElement languageToggleBtn = null;
	protected WebElement myProfileMenu = null;
	protected WebElement profileSubMenu=null;
	protected WebElement quickStartMenu = null;
	protected WebElement getStartWithUpsLink=null;
	WebElement getStartedText;
	protected WebElement errorMsg = null;
	protected WebElement trackByTrackingNumbersBtn=null;
	WebElement submitArrowBtn;
	WebElement shipLink;
	WebElement quoteButton;
	WebElement shipmentType;
	WebElement weightBox;
	WebElement shipFromBox;
	WebElement origPostCode;
    WebElement shipToBox;
	WebElement destPostCode;
	WebElement checkBox;
	WebElement getQuoteButton;
	WebElement locationLink;
	WebElement viewAndPayBillLink;
	WebElement trackingLink;
	
	
	
	public HomePageModel(WebDriver driver) {
		super(driver);
		
	}
	
	public WebElement login() {
		loginBtn=driver.findElement(By.xpath("//*[@id='ups-navItems']/ul[2]/li[1]/a"));
		return loginBtn;
	}
	public WebElement signUp() {
		signUpBtn=driver.findElement(By.xpath("//*[@id='ups-navItems']/ul[2]/li[2]/a[contains(text(), 'Sign Up')]"));
		return signUpBtn;
	}
	public WebElement location() {
		locationBtn=driver.findElement(By.xpath("//*[@id='ups-navItems']/ul[2]/li[3]/a"));
		return locationBtn;
	}
	public WebElement languageToggle() {
		languageToggleBtn = driver.findElement(By.xpath("//*[@id='ups-language-toggle']"));
		return languageToggleBtn;
	}
	public WebElement myProfile() {
		myProfileMenu = driver.findElement(By.xpath("//*[@id='ups-account-toggle']"));
		return myProfileMenu;
	}
	
	
	public WebElement tracking() {
		trackingBtn = driver.findElement(By.xpath("//a[@id='ups-menuLinks0' and contains(text(),'Tracking')]"));
		return trackingBtn;
	}
	public WebElement shipping() {
		shippingBtn = driver.findElement(By.xpath("//a[@id='ups-menuLinks1' and contains(text(),'Shipping')]"));
		return shippingBtn;
	}
	public WebElement services() {
		servicesMenu = driver.findElement(By.xpath("//a[@id='ups-menuLinks2' and contains(text(),'Services')]"));
		return servicesMenu;
	}
	
	public WebElement profileSubMenu(String submenu) {
		profileSubMenu=driver.findElement(By.xpath("//*[@id='ups-navItems']//div//a[contains(text(),'"+submenu+"')]"));
		return profileSubMenu;
	}
	public WebElement quickStart() {
		quickStartMenu = driver.findElement(By.xpath("//*[@id='ups-quickStartMenu']"));
		return quickStartMenu;
	}
	public WebElement getStartedText() {
		getStartedText=driver.findElement(By.xpath("//div[@class='ups-headerTools_msg']//a[contains(text(),'Get Started with UPS')]"));
		return getStartedText;
	}
	public WebElement getStartWithUps() {
		getStartWithUpsLink = driver.findElement(By.xpath("//a[text()='Get Started with UPS']"));
		return getStartWithUpsLink;
	}
	public WebElement trackByTrackingNumbers() {
		trackByTrackingNumbersBtn = driver.findElement(By.xpath("//div[@class='ups-simpleTrack_input_wrap']"));
		return trackByTrackingNumbersBtn;
	}
	public WebElement clickOnSubmitBtn() {
		submitArrowBtn = driver.findElement(By.xpath("//button[@id='ups-tracking-submit']"));
		return submitArrowBtn;
	}
	public WebElement errMessage(){
		errorMsg = driver.findElement(By.xpath("//div[@class='ups-form_group']//p"));
		return errorMsg;
	}
	public WebElement clickOnShipLink() {
		shipLink = driver.findElement(By.xpath("//a[@id='ups-quickStartShip']"));
		return shipLink;
	}
	public WebElement getQuote() {
		quoteButton = driver.findElement(By.xpath("//a[@id='ups-quickStartQuote']"));
		return quoteButton;
	}
	public WebElement shipmentType() {
		shipmentType = driver.findElement(By.name("shipmentType"));
		return shipmentType;
	}
	
	
	public WebElement weight() {
		weightBox = driver.findElement(By.name("weight"));
		return weightBox;
	}
	public WebElement originCountry() {
		shipFromBox = driver.findElement(By.name("origCountry"));
		return shipFromBox;
	}
	public WebElement originPostCode() {
		origPostCode = driver.findElement(By.name("origPostalCode"));
		return origPostCode;
	}
	public WebElement destinationCountry() {
		shipToBox = driver.findElement(By.name("destCountry"));
		return shipToBox;
	}
	public WebElement destinationPostCode() {
		destPostCode = driver.findElement(By.name("destPostalCode"));
		return destPostCode;
	}
	public WebElement residentialCheckBox() {
		checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		return checkBox;
	}
	public WebElement quoteSubmit() {
		getQuoteButton = driver.findElement(By.xpath("//div[@class='ups-form_ctaGroup ups-inactive']//button[@type='submit']"));
		return getQuoteButton;
	}
	public WebElement clickOnLocations() {
		locationLink = driver.findElement(By.xpath("//a[@id='ups-quickStartLocation']"));
		return locationLink;
	}
	public WebElement clickOnViewAndPayBillLink() {
		viewAndPayBillLink = driver.findElement(By.xpath("//a[@class='ups-analytics ups-headerTools_widgetToggle'"
				+ " and contains(text(),'View & Pay Bill')]"));
		return viewAndPayBillLink;
	}
	
	
	
	
}

