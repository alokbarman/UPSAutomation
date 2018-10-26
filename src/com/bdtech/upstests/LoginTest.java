package com.bdtech.upstests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bdtech.scriptbase.TestBase;

public class LoginTest extends TestBase {
	
	@Test(priority=1)
	public void pageTitleTest() {
		homePage().selectMainMenu("Log In");
		String title = loginPage().verifyLoginPageTitle();
		String expected = "Log in | UPS";
		Assert.assertEquals(title, expected);
	}
	
	public void verifyPageTitleTest() {
		homePage().selectMainMenu("Log In");
		WebElement flag = loginPage().verifyLoginText();
		Assert.assertTrue(true);
	}
	@Test(priority=2)
	public void testLoginWithValidUIDAndWrongPassword() throws InterruptedException {
		homePage().selectMainMenu("Log In");
		loginPage().loginInput("test@gmail.com", "test123", false);
		String msg = "does not match";
		String actualMsg= loginPage().getMsg();
		Assert.assertTrue(actualMsg.contains(msg));	
	}
	@Test(priority=3)
	public void testLoginWithValidUidAndPass() throws InterruptedException {
		homePage().selectMainMenu("Log In");
		loginPage().loginInput("Alok76", "Kumar1976", true);	
	}
	
	@Test(priority=5)
	public void clickOnSignupLinkTest() {
		homePage().selectMainMenu("Log In");
		loginPage().signupLink(true);
	}
	@Test(priority=6)
	public void loginInputTest() throws InterruptedException {
		
		homePage().selectMainMenu("Log In");
		loginPage().loginInput("Alok76", "Kumar1976", true);
		String actual = loginPage().userProfileName().getText();
		String expected = "ALOK BARMAN";
		Assert.assertEquals(actual, expected);
	}
	

}
