package com.bdtech.upstests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bdtech.scriptbase.TestBase;

public class SignUpTest extends TestBase {

	@Test
	public void verifyPageTitleTest() {
		homePage().selectMainMenu("Sign Up");
		String expected = "Sign up | UPS";
		String title = signUpPage().verifyPageTitle();
		Assert.assertEquals(title, expected);
		//Assert.assertTrue(true, "Sign Up page is not found");
	}

	@Test
	public void signUpWithNoName() throws Exception {

		homePage().selectMainMenu("Sign Up");
		signUpPage().signUpInput("null", "alokgr88@gmail.com", "Alok761", "Kumar1976", true);
	}

	@Test
	public void signUpWithNoEmail() throws Exception {
		homePage().selectMainMenu("Sign Up");
		signUpPage().signUpInput("Alok Barman", "null", "Alok761", "Kumar1976", true);
		
	}

	@Test
	public void signUpWithNoId() throws Exception {
		homePage().selectMainMenu("Sign Up");
		signUpPage().signUpInput("Alok Barman", "alokgr88@gmail.com", "null", "Kumar1976", true);
		
	}
	@Test
	public void signUpTest() throws Exception {
		homePage().selectMainMenu("Sign Up");
		signUpPage().signUpInput("Alok Barman", "alokgr88@gmail.com", "Alok761", "Kumar1976", true);
	}

}
