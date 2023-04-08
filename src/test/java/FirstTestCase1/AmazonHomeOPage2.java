package FirstTestCase1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
@Test
public class AmazonHomeOPage2 {
	public static void verifyToMensPoloShirts() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.cssSelector("input[aria-label='Search Amazon.in']")).sendKeys("parx");
		// driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		List<WebElement> elements = driver.findElements(By.cssSelector("div[aria-label='parx shirt for men']"));
		for (WebElement item : elements) {
			String ProductName = item.getText();

			if (ProductName.equalsIgnoreCase("parx shirt for men")) {
				item.click();
				break;
			}
		}
	driver.findElement(By.cssSelector("img[alt='Sponsored Ad - Parx Medium Blue Shirt']")).click();
	driver.findElement(By.cssSelector("input[aria-describedby=\"size_name_0-announce\"]")).click();
		driver.findElement(By.cssSelector("span#a-autoid-0-announce")).click();
	driver.findElement(By.cssSelector("a#mobileQuantityDropDown_2")).click();
		driver.findElement(By.cssSelector("input#add-to-cart-button")).click();
//		driver.findElement(By.cssSelector("a#mobileQuantityDropDown_2")).click();
//		driver.findElement(By.cssSelector("input#add-to-cart-button")).click();
		
		
		
	}
}
