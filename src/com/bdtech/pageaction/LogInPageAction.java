package com.bdtech.pageaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.bdtech.pagemodel.LogInPageModel;

public class LogInPageAction extends ActionBase {

	LogInPageModel loginPage = null;

	public LogInPageAction(WebDriver driver) {
		super(driver);

		loginPage = new LogInPageModel(driver);

	}
	public String verifyLoginPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public WebElement verifyLoginText() {
		WebElement text =loginPage.verifyLoginPageText();
		return text;
	}
	public void signupLink(boolean confirm) {
		loginPage.signUpLink().click();
	}
	
	public String getMsg() {
		return loginPage.errMsg().getText();
	}

	public void loginInput(String emailOrUserId, String password, boolean confirm) throws InterruptedException {
		if (emailOrUserId != null) {
			loginPage.emailInput().sendKeys(emailOrUserId);

			if (password != null) {
				loginPage.pwdInput().sendKeys(password);

				if (confirm == true) {
					Thread.sleep(2000);
					loginPage.checkBox().click();
				}
			}
		}
		loginPage.clickLoginButton().click();
	}
	public WebElement userProfileName() {
		WebElement profileName = loginPage.varifyProfileName();
		return profileName;
	}

		
}
