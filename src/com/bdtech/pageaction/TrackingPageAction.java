package com.bdtech.pageaction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.bdtech.pagemodel.TrackingPageModel;

public class TrackingPageAction extends ActionBase {

	TrackingPageModel trackingPageModel;

	public TrackingPageAction(WebDriver driver) {
		super(driver);
		trackingPageModel = new TrackingPageModel(driver);
	}
	
	public void clickOnTrackAndTrackingHistLink() {
		trackingPageModel.trackAndTrackingHistoryLink().click();
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String getPageText() {
		String trackingPageText = trackingPageModel.trackAndTrackingPageText().getText();
		return trackingPageText;
	}

	public String trackingByNumber(String trackNumber) {

		trackingPageModel.trackingOrInfoNumber().clear();
		trackingPageModel.trackingOrInfoNumber().sendKeys(trackNumber);
		trackingPageModel.clickOnTrackButton().click();
		String errorMsg = trackingPageModel.errorMessage().getText();
		return errorMsg;
	}

	public void selectMenu(String menu) {
		switch (menu) {
		case "Track by Reference":
			trackingPageModel.trackByReference().click();
			break;
		case "Track by E-mail":
			trackingPageModel.trackByEmail().click();
			break;
		case "Import Tracking Numbers":
			trackingPageModel.importTrackingNumber().click();
			break;
		case "SMS Tracking":
			trackingPageModel.smsTracking().click();
			break;
		case "UPS My Choice":
			trackingPageModel.upsMyChoice().click();
			break;
		case "Quantum View":
			trackingPageModel.quantumView().click();
			break;
		case "Flex Global View":
			trackingPageModel.flexGlobalView().click();
			break;
		default:
			System.out.println("No Match");
		}
	}

	public void selectRadioButton(String button) {
		switch (button) {
		case "Package":
			trackingPageModel.packageRadioButton().isSelected();
			break;
		case "Freight":
			trackingPageModel.freightRadioButton().click();
			break;
		case "Mail Innovations":
			trackingPageModel.mailInnovationsRadioButton().click();
			break;
		}
	}

	public String trackByPackageReference(String shipmentRefer, String mm_dd_yyyy, String mmddyyyy, String shipperAcNo,
			String country, String postCode) throws InterruptedException {
		trackingPageModel.shifmentReference().sendKeys(shipmentRefer);
		trackingPageModel.selectShipmentDateFrom().sendKeys(mm_dd_yyyy);
		trackingPageModel.selectShipmentDateTo().sendKeys(mmddyyyy);
		trackingPageModel.shipperAcc().sendKeys(shipperAcNo);
		Select select = new Select(trackingPageModel.destinationCountry());
		select.selectByVisibleText(country);
		trackingPageModel.destinationZipOrPostalCode().sendKeys(postCode);
		trackingPageModel.clickOnTrckButton().click();
		Thread.sleep(2000);
		
		/*Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();*/
		
		return trackingPageModel.trackingErrorMessage().getText();
		
	}

	public String trackByFreightReference(String shipmentRefer,String mm_dd_yyyy, String mmddyyyy, String shipperAcNo,String originTerritory, String destTerritory, String postCode) {
		trackingPageModel.shifmentReference().sendKeys(shipmentRefer);
		trackingPageModel.selectShipmentDateFrom().sendKeys(mm_dd_yyyy);
		trackingPageModel.selectShipmentDateTo().sendKeys(mmddyyyy);
		trackingPageModel.shipperAcc().sendKeys(shipperAcNo);
		Select originCountry = new Select(trackingPageModel.originTerritory());
		originCountry.selectByVisibleText(originTerritory);
		Select destCountry = new Select(trackingPageModel.destinationTerritory());
		destCountry.selectByVisibleText(destTerritory);
		trackingPageModel.destinationZipOrPostalCode().sendKeys(postCode);
		trackingPageModel.clickOnTrckButton().click();

		String trackErrMsgText = trackingPageModel.trackingErrorMessage().getText();
		return trackErrMsgText;
	}
	public String trackByMailInnovationsReference(String shipmentRef,String mm_dd_yyyy,String mmddyyyy,String destPostCode) {
		trackingPageModel.shifmentReference().sendKeys(shipmentRef);
		trackingPageModel.selectShipmentDateFrom().sendKeys(mm_dd_yyyy);
		trackingPageModel.selectShipmentDateTo().sendKeys(mmddyyyy);
		trackingPageModel.destinationZipOrPostalCode().sendKeys(destPostCode);
		trackingPageModel.clickOnTrckButton().click();
		String mailTrackingErrorMsg = trackingPageModel.trackingErrorMessage().getText();
		return mailTrackingErrorMsg;
	}

}
