package com.bdtech.pagemodel;

import org.openqa.selenium.WebDriver;

public class ModelBase {
	
	WebDriver driver;
	int temp;
	
	public ModelBase(WebDriver driver) {
		this.driver = driver;
		this.temp =20;
	}

}
