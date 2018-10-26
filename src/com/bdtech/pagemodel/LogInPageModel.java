package com.bdtech.pagemodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageModel extends ModelBase {
	
	protected WebElement emailInput = null;
	protected WebElement pwdInput = null;
	protected WebElement loginPageText = null;
	protected WebElement signUpLink = null;
	protected WebElement checkBox = null;
	protected WebElement clickLoginButton = null;
	protected WebElement errMsg = null;
	WebElement profileName;

	public LogInPageModel(WebDriver driver) {
		super(driver);
		
	}
	public WebElement verifyLoginPageText() {
		loginPageText = driver.findElement(By.xpath("//div[@class='page-title_cell']"));
		return loginPageText;
	}
	public WebElement signUpLink() {
		signUpLink = driver.findElement(By.xpath("//a[@id='DOARegisterLink']"));
		return signUpLink;
	}
	public WebElement errMsg() {
		errMsg= driver.findElement(By.xpath("//*[@id='ups-main']/div/div/form/p[2]"));
		return errMsg;
	}
	public WebElement emailInput() {
		emailInput =driver.findElement(By.xpath("//*[@id='email']"));
		return emailInput;
		
	}
	public WebElement pwdInput() {
		pwdInput =driver.findElement(By.xpath("//input[@id='pwd']"));
		return pwdInput;
	}
	public WebElement checkBox() {
		checkBox = driver.findElement(By.xpath("//input[@name='rememberMe']"));
		return checkBox;
	}
	public WebElement clickLoginButton() {
		clickLoginButton = driver.findElement(By.xpath("//button[@id='submitBtn']"));
		return clickLoginButton;
	}
	public WebElement varifyProfileName() {
		profileName = driver.findElement(By.xpath("//a[contains(text(),'ALOK BARMAN')]"));
		return profileName;
	}
	
	

}
