package com.testingshatra.keywords;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class UIkeywords {
	public static RemoteWebDriver driver;
	public static FluentWait<WebDriver> wait;
	

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(option);
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}
		wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
	
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void waitForElementToBePresent(By by) {
		wait.until(ExpectedConditions.presenceOfElementLocated(by) );
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void getTextMethod(By element, String text) {
		driver.findElement(element).sendKeys(text);
	}

	public static void clickOn(By by) {						//overloading using by
		driver.findElement(by).click();
	}
	public static void clickOn(String locator) {					// overloading using string
		driver.findElement(By.cssSelector(locator)).click();
		
	}

	public static void CurrentUrl(String url) {
		driver.get(url);
	}

	public static void selectDropDown(By by) {
		WebElement element = driver.findElement(by);
		Select select1 = new Select(element);
		select1.selectByIndex(3);

	}
		

}