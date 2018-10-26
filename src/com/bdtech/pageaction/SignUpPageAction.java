package com.bdtech.pageaction;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.bdtech.pagemodel.SignUpPageModel;

public class SignUpPageAction extends ActionBase {
	
	SignUpPageModel signUp= null;

	public SignUpPageAction(WebDriver driver) {
		super(driver);
		
		signUp = new SignUpPageModel(driver);
	}
	public String verifyPageTitle() {
		return driver.getTitle();
		//return title;
	}
	
	
	public void signUpInput(String name,String email, String uid, String pass, boolean confirm) throws Exception {
		if(name!=null) {
			signUp.name().sendKeys(name);
		}
		if(email !=null) {
			signUp.email().sendKeys(email);
		}
		if(uid != null) {
			signUp.uid().sendKeys(uid);
		}
		if(pass != null) {
			signUp.passWord().sendKeys(pass);
		}
		if(confirm == true) {
			signUp.selectAgreement().click();
		}
		Thread.sleep(2000);
		
		//signUp.submitSignUpbutton().click();
		
		
	}

}
