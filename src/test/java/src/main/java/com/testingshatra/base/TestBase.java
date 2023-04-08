package com.testingshatra.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.testingshatra.keywords.UIkeywords;

public class TestBase {
	@BeforeMethod
	public static void openBrowser() {
		UIkeywords.openBrowser("Chrome");
		//UIkeywords.launchUrl("https://www.Amazon.in");
		UIkeywords.launchUrl("https://automationexercise.com/");
	}
	@AfterMethod
	public static void tearDown() {
		UIkeywords.closeBrowser();
	}
}
