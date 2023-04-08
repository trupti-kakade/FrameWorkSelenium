package FirstTestCase1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.testingshatra.base.TestBase;
import com.testingshatra.keywords.UIkeywords;



public class AmazonHomePage extends TestBase {
	@Test
	public static void verifyToFindWatches() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement searchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		searchBox.sendKeys("mens watches timex  ");

		List<WebElement> elements = driver.findElements(By.cssSelector("div[aria-label=\"mens watches timex\"]"));

		for (WebElement item : elements) {
			String ProductName = item.getText();

			if (ProductName.equalsIgnoreCase("mens watches timex")) {
				item.click();
				break;
			}

		}
		//driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		driver.get(
				"https://www.amazon.in/Timex-Analog-Blue-Dial-Watch-TW00ZR262E/dp/B07H3K85H5/ref=sr_1_1_sspa?keywords=mens+watches+branded+under+1000&qid=1680028181&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		driver.findElement(By.cssSelector("a#mbbPopoverLink")).click();
		Select select1 = new Select(driver.findElement(By.cssSelector("select#quantity")));
		select1.selectByIndex(2);
		driver.findElement(By.cssSelector("button#a-autoid-15-announce")).click();
		driver.findElement(By.cssSelector("input#add-to-cart-button")).click();
		driver.findElement(By.cssSelector("input[aria-labelledby=\"attachSiNoCoverage-announce\"]")).click();
		driver.findElement(By.cssSelector("input[data-feature-id='proceed-to-checkout-action']")).click();
	}

						
						// KEYWORDS DRIVEN FRAMEWORK//
	@Test
	public void verifyToFindBrandedWatches() throws InterruptedException {

		UIkeywords.getTextMethod(By.cssSelector("input.nav-input.nav-progressive-attribute"),
				"mens watches timex");

		UIkeywords.clickOn(By.cssSelector("div.nav-search-submit"));
		UIkeywords.CurrentUrl(
				"https://www.amazon.in/Timex-Analog-Blue-Dial-Watch-TW00ZR262E/dp/B07H3K85H5/ref=sr_1_1_sspa?keywords=mens+watches+branded+under+1000&qid=1680028181&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		UIkeywords.clickOn(By.cssSelector("a#mbbPopoverLink"));
		UIkeywords.selectDropDown(By.cssSelector("select#quantity"));
		//UIkeywords.clickOn(By.cssSelector("button#a-autoid-15-announce"));
		UIkeywords.clickOn(By.cssSelector("input#add-to-cart-button"));
		UIkeywords.clickOn(By.cssSelector("input[aria-labelledby='attachSiNoCoverage-announce']"));
		UIkeywords.clickOn(By.cssSelector("input[data-feature-id='proceed-to-checkout-action']"));

	}
}
