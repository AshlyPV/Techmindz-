package com.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.HomePage;

public class HomePageTestCases extends TestBase {
	HomePage homePage;

	public HomePageTestCases() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initialization();
		homePage = new HomePage();
	}

	@Test(priority = 1) // For every Test case this annotation is necessary
	public void clickOnSignUpButton() {
		homePage.clickSignUpButton();
		homePage.signUpEnterUserName("Jabajaba123");
		homePage.signUpEnterPassword("Test");
		homePage.clickSignUp();
		homePage.clickSignUpAlert();
		// homePage.clickSignUpCloseButton();
	}

	@Test(priority = 2)
	public void clickOnLoginButton() {
		homePage.clickLoginButton();
		homePage.loginEnterUserName("Jabajaba123");
		homePage.loginEnterPassword("Test");
		homePage.clickLogin();
		//homePage.clickLoginAlert();
		// homePage.clickLogInCloseButton();
	}

	@Test(enabled = false)
	public void clickOnContactButton() {
		homePage.clickContactButton();
		homePage.contactMsgEnterMail("ashly_test@gmail.com");
		homePage.contactMsgEnterName("TesterAshly");
		homePage.contactMsgEnterMsg("Test Message");
		homePage.clickContactSendMsg();
		homePage.clickContactAlert();
		// homePage.clickContactCloseButton();
	}

	@Test(enabled = false)
	public void clickOnAboutUs() {
		homePage.clickAboutUs();
		homePage.clickPlayAboutUs();
		homePage.clickCloseAboutUs();
	}

	//<--------Test Data---->
		String pTestUserName = "Welcome Jabajaba123";// expected result
		String pCurrentUser =  pTestUserName.split(" ")[1];//actual result
		
		@Test(priority = 3)
		public void userNameVerification() {
			Assert.assertEquals(pCurrentUser,"Jabajaba123","User Name Verified Successfully,!");
			
		}

}
