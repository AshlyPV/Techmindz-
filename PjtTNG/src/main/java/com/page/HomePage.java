package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class HomePage extends TestBase {

	Wrapper objWrapper = new Wrapper();

	@FindBy(id = "signin2")
	WebElement pSignUpButton;
	@FindBy(id = "sign-username")
	WebElement pSignUpUserName;
	@FindBy(id = "sign-password")
	WebElement pSignUpPassword;
	@FindBy(xpath = "(//*[text()='Sign up'])[2]")
	WebElement pSignUp;
	@FindBy(xpath = "(//*[text()='Close'])[2]")
	WebElement pSignUpCloseButton;
	@FindBy(id = "login2")
	WebElement pLoginButton;
	@FindBy(id = "loginusername")
	WebElement pLoginUserName;
	@FindBy(id = "loginpassword")
	WebElement pLoginPassword;
	@FindBy(xpath = "(//*[text()='Log in'])[2]")
	WebElement pLogin;
	@FindBy(xpath = "(//*[text()='Close'])[3]")
	WebElement pLogInCloseButton;
	@FindBy(xpath = "//*[text()='Contact']")
	WebElement pContactButton;
	@FindBy(xpath = "(//*[text()='Close'])[1]")
	WebElement pContactCloseButton;
	@FindBy(id = "recipient-email")
	WebElement pContacteMail;
	@FindBy(id = "recipient-name")
	WebElement pContactName;
	@FindBy(id = "message-text")
	WebElement pContactMessage;
	@FindBy(xpath = "//*[text()='Send message']")
	WebElement pSendMessage;
	@FindBy(xpath = "(//*[text()='About us'])[2]")
	WebElement pAboutUs;
	// @FindBy(xpath = "(//span[@class='vjs-icon-placeholder'])[1]")
	@FindBy(xpath = "//button[@title='Play Video']")
	WebElement pPlayAboutUs;
	@FindBy(xpath = "(//*[text()='Close'])[4]")
	WebElement pCloseAboutUs;
	@FindBy(xpath = "//a[@id='nameofuser']")
	WebElement pGetUserName;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// <....To click signup......>
	public void clickSignUpButton() {
		pSignUpButton.click();
	}

	public void clickSignUpCloseButton() {
		objWrapper.waitForElement(driver, pSignUpCloseButton);
		pSignUpCloseButton.click();
	}

	// <-----Sign Up Enter Text----->
	public void clearSignUpUName() {
		objWrapper.clearText(pSignUpUserName);
	}

	public void signUpEnterUserName(String pValue) {
		objWrapper.enterText(pValue, pSignUpUserName, driver);
	}

	public void clearSignUpPwd() {
		objWrapper.clearText(pSignUpPassword);
	}

	public void signUpEnterPassword(String pValue) {
		objWrapper.enterText(pValue, pSignUpPassword, driver);
	}

	public void clickSignUp() {
		pSignUp.click();
	}

	public void clickSignUpAlert() {
		// objWrapper. waitForAlert(driver);
		objWrapper.alertMessage(driver);
	}

	// <....To click Login......>
	public void clickLoginButton() {
		pLoginButton.click();
	}

	public void clickLogInCloseButton() {
		objWrapper.waitForElement(driver, pLogInCloseButton);
		pLogInCloseButton.click();
	}

	// <-----Login Enter Text----->
	public void clearLoginUName() {
		objWrapper.clearText(pLoginUserName);
	}

	public void loginEnterUserName(String pValue) {
		objWrapper.enterText(pValue, pLoginUserName, driver);
	}

	public void clearLoginPwd() {
		objWrapper.clearText(pLoginPassword);
	}

	public void loginEnterPassword(String pValue) {
		objWrapper.enterText(pValue, pLoginPassword, driver);
	}

	public void clickLogin() {
		pLogin.click();
	}

	public void clickLoginAlert() {
		// objWrapper. waitForAlert(driver);
		objWrapper.alertMessage(driver);
		// waitForAlert(driver);
		// Alert alert = driver.switchTo().alert();
		// alert.dismiss();
	}

	// <....To click Contact......>
	public void clickContactButton() {
		pContactButton.click();
	}

	/*
	 * public void clickContactCloseButton() { objWrapper.waitForElement(driver,
	 * pContactCloseButton); pContactCloseButton.click(); }
	 */
	// <-----To fill contact form----->
	public void contactMsgEnterMail(String pValue) {
		objWrapper.enterText(pValue, pContacteMail, driver);
	}

	public void contactMsgEnterName(String pValue) {
		objWrapper.enterText(pValue, pContactName, driver);
	}

	public void contactMsgEnterMsg(String pValue) {
		objWrapper.enterText(pValue, pContactMessage, driver);
	}

	// <--------To Send Contact Message>
	public void clickContactSendMsg() {
		objWrapper.waitForElement(driver, pSendMessage);
		pSendMessage.click();
	}

	public void clickContactAlert() {
		objWrapper.alertMessage(driver);
	}

	// <....To click About Us......>
	public void clickAboutUs() {
		pAboutUs.click();
	}

	public void clickPlayAboutUs() {
		pPlayAboutUs.click();
	}

	// <-------Close About Us-------->
	public void clickCloseAboutUs() {
		objWrapper.waitForElement(driver, pCloseAboutUs);
		pCloseAboutUs.click();
	}

	// <....To get User name after Successful Login......>

	public String getUserName() {
		// objWrapper.retrieveText(pValue, pGetUserName, driver);
		String pUser = pGetUserName.getText();
		return(pUser);
		// System.out.println(pText);
	}

}
