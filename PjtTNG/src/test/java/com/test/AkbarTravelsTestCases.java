package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.AkbarTravelsLandingPage;

public class AkbarTravelsTestCases extends TestBase{

	AkbarTravelsLandingPage akPage;
	
	public AkbarTravelsTestCases() {
		super();
	}
	
	@BeforeClass
	public void setUp() {
		initialization();
		akPage = new AkbarTravelsLandingPage();
	}
	
	@Test
	public void clickOnFrom() {
		akPage.selectFromList();
	}
}
