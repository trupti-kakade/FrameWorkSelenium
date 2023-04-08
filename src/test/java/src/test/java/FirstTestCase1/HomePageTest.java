package FirstTestCase1;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.ScriptTimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testingshatra.base.TestBase;
@Test
public class HomePageTest {
	public void verifyCarsUnder5LakhPriceLessOrEqualTo5Lakh() throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.carwale.com");
		try{
			driver.executeAsyncScript("window.scrollBy(0,300)");
		}catch(ScriptTimeoutException e) {
			
		}
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[title='under 5 lakh']")).click();
		List<WebElement>priceElement=driver.findElements(By.cssSelector("span.o-Hyyko.o-cyHybq.o-eZTujG.o-eqqVmt"));
		for( WebElement originalPrice:priceElement){
			
			String price=originalPrice.getText();
			System.out.println(price);
			String regex="([0-9]+[.][0-9]+)";
			String input=price;
			
			Pattern pattern=Pattern.compile(regex);
			Matcher matcher=pattern.matcher(input);
			while(matcher.find()) {
				float priceValue=Float.parseFloat(matcher.group());
				Assert.assertTrue( priceValue<5.0f);
			}
		}
	}
}
