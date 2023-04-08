package FirstTestCase1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
@Test
public class MyntraWebSiteTC1 {
	public static void verifyToSearchItems() throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		ChromeDriver driver = new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://www.myntra.com");
		
		driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"))
				.sendKeys("polo");
		
		List<WebElement> elements = driver.findElements(By.cssSelector("li.desktop-suggestion.null"));
		
		for (WebElement item : elements) {
			String ProductName = item.getText();
		
			if (ProductName.equalsIgnoreCase("Polo Tshirts For Men")) {
				item.click();
				break;
			}

		}
//		
//		String title=driver.getTitle();
//		System.out.println("items title"+title);
//		Assert.assertTrue(title.contains("polo"));
		
		driver.get("https://www.myntra.com/tshirts/allen-solly/allen-solly-men-blue-solid-polo-collar-pure-cotton-t-shirt/10766822/buy");
		driver.findElement(By.cssSelector("button.size-buttons-show-size-chart")).click();
		//driver.findElement(By.cssSelector(""))
	}

}
