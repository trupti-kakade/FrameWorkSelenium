package FirstTestCase1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.testingshatra.base.TestBase;
import com.testingshatra.keywords.UIkeywords;
//@Test

public class AutomationPracticeTestCase extends TestBase {
	
	public static void verifyToNewUserLogin() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		

		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://automationexercise.com/");
		
//	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//	//	driver.findElement(By.cssSelector("i.fa.fa-lock")).click();
//	//	driver.findElement(By.cssSelector("input[data-qa='signup-name']")).sendKeys("Trupti Jadhav");
//	//	driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys("trupti.kakade23@gmail.com");
//	//	driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();
//		
//	//	driver.findElement(By.cssSelector("input#id_gender2")).click();
//	//	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("trupti123");
//		WebElement element= driver.findElement(By.cssSelector("select#days"));
//		Select select1=new Select(element);
//		select1.selectByIndex(7);
//		WebElement element1=driver.findElement(By.cssSelector("select#months"));
//		Select select2=new Select(element1);
//		select2.selectByVisibleText("June");
//		WebElement element3=driver.findElement(By.cssSelector("select#years"));
//		Select select3=new Select(element3);
//		select3.selectByIndex(18);
//		driver.findElement(By.cssSelector("input#newsletter")).click();
//		driver.findElement(By.cssSelector("input#optin")).click();
//		
//		driver.findElement(By.cssSelector("input[data-qa='first_name']")).sendKeys("Trupti");
//		driver.findElement(By.cssSelector("input#last_name")).sendKeys("Jadhav");
//		driver.findElement(By.cssSelector("input[data-qa='company']")).sendKeys("IT");
//		driver.findElement(By.cssSelector("input[data-qa='address']")).sendKeys("xyz");
//		//driver.findElement(By.cssSelector("address2")).sendKeys("ABC");
//		WebElement Country=driver.findElement(By.cssSelector("select#country"));
//		Select select4=new Select(Country);
//		select4.selectByVisibleText("India");
//		driver.findElement(By.cssSelector("input[data-qa='state']")).sendKeys("Maharashtra");
//		driver.findElement(By.cssSelector("input[data-qa='city']")).sendKeys("Pune");
//		driver.findElement(By.cssSelector("input[data-qa='zipcode']")).sendKeys("411027");
//		driver.findElement(By.cssSelector("input[data-qa='mobile_number']")).sendKeys("9657154656");
//		driver.findElement(By.cssSelector("button[data-qa='create-account']")).click();
//		driver.findElement(By.cssSelector("a[data-qa='continue-button']")).click();
//		driver.findElement(By.cssSelector("a[href=\"/delete_account\"]")).click();
//		driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
		
	}
		@Test
        public static void verifyToNewUserLogin1() {
        	UIkeywords.waitForElementToBePresent(By.cssSelector("i.fa.fa-lock"));
        	UIkeywords.clickOn(By.cssSelector("i.fa.fa-lock"));
        	UIkeywords.getTextMethod(By.cssSelector("input[data-qa='signup-name']"),"Trupti Jadhav");
        	UIkeywords.getTextMethod(By.cssSelector("input[data-qa='signup-email']"), "trupti.kakade24@gmail.com");
        	UIkeywords.clickOn(By.cssSelector("button[data-qa='signup-button']"));
        	UIkeywords.clickOn(By.cssSelector("input#id_gender2"));
        	UIkeywords.getTextMethod(By.cssSelector("input[type='password']"), "trupti123");
        	UIkeywords.selectDropDown(By.cssSelector("select#days"));
        	UIkeywords.selectDropDown(By.cssSelector("select#months"));
        	UIkeywords.selectDropDown(By.cssSelector("select#years"));
        	UIkeywords.clickOn(By.cssSelector("input#newsletter"));
        	UIkeywords.clickOn(By.cssSelector("input#optin"));
        	UIkeywords.getTextMethod(By.cssSelector("input[data-qa='first_name']"), "Trupti");
        	UIkeywords.getTextMethod(By.cssSelector("input#last_name"), "Jadhav");
        	UIkeywords.getTextMethod(By.cssSelector("input[data-qa='company']"), "IT");
        	UIkeywords.getTextMethod(By.cssSelector("input[data-qa='address']"), "ARV Imperia,pune");
        	UIkeywords.selectDropDown(By.cssSelector("select#country"));
        	UIkeywords.getTextMethod(By.cssSelector("input[data-qa='state']"), "Maharashtra");
        	UIkeywords.getTextMethod(By.cssSelector("input[data-qa='city']"), "Pune");
        	UIkeywords.getTextMethod(By.cssSelector("input[data-qa='zipcode']"), "411160");
        	UIkeywords.getTextMethod(By.cssSelector("input[data-qa='mobile_number']"), "9657334567");
        	UIkeywords.clickOn(By.cssSelector("button[data-qa='create-account']"));
        	UIkeywords.clickOn(By.cssSelector("a[data-qa='continue-button']"));
        	UIkeywords.clickOn(By.cssSelector("a[href=\\\"/delete_account\\\"]"));
        	UIkeywords.clickOn(By.cssSelector("a.btn.btn-primary"));
        	
        }
        
}
	

