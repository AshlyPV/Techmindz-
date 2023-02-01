package com.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.TestBase;
import com.wrapper.Wrapper;

public class AkbarTravelsLandingPage extends TestBase {

	Wrapper objWrapper = new Wrapper();

	//@FindBy(id = "(//h6[@class='ng-tns-c8-3'])[1]")
	@FindBy(id = "//*[@id='liFrom']")
	WebElement pFrom;
	// @FindBy(id = "//ul[@id='list']//li[@id='COK1']")
	// @FindBy(xpath = '//ul[@id='list']//li//a')
	// WebElement pDeprture;

	public AkbarTravelsLandingPage() {
		PageFactory.initElements(driver, this);
	}

	// <-----To Select From-------->
	public void selectFromList() {
		objWrapper.waitForElement(driver,pFrom);
		pFrom.click();
		List<WebElement> pDeprture = driver.findElements(By.xpath("//ul[@id='list']//li//a"));
		pDeprture.get(275).click();
	}
}
