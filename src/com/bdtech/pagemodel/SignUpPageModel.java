package com.bdtech.pagemodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
     
     

public class SignUpPageModel extends ModelBase{
	protected WebElement name = null;
	protected WebElement email = null;
	protected WebElement uid = null;
	protected WebElement passWord = null;
	protected WebElement selectAgreement = null;
	protected WebElement submitSignUpButton = null;
	protected WebElement signupPageTitle = null;

	public SignUpPageModel(WebDriver driver) {
		
		super(driver);
	}
	
	public WebElement verifySignupPageTitle() {
		signupPageTitle = driver.findElement(By.xpath("//div[@class='page-title_cell']"));
		return verifySignupPageTitle();
	}
	public WebElement name() {
		name= driver.findElement(By.xpath("//input[@name='fullName']"));
		return name;
		
	}
	public WebElement email() {
		email= driver.findElement(By.xpath("//input[@name='email_input']"));
		return email;
		
	}
	
	public WebElement uid() {
		uid= driver.findElement(By.xpath("//input[@name='user_id_input']"));
		return uid;
		
	}
	public WebElement passWord() {
		passWord= driver.findElement(By.xpath("//input[@id='ups-user_password_input']"));
		return passWord;	
	}
	public WebElement selectAgreement() {
		selectAgreement = driver.findElement(By.xpath("//div[@class='ups-checkbox ups-input_wrapper']//input[@id='ups-terms_checkbox']"));
		return selectAgreement;
	}
	public WebElement submitSignUpbutton() {
		submitSignUpButton = driver.findElement(By.xpath("//*[@id='SignupDiv']/div[1]/div/div/div[2]/div[2]/form/div[4]/div/button"));
		return submitSignUpButton;
	}
	

}
