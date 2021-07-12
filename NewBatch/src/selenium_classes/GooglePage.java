package selenium_classes;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ReusableMethods;

public class GooglePage extends ReusableMethods {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");

		WebDriver driver = initBrowser("chrome");

		driver.get("https://www.google.com/");
		takeScreenShot();
		// driver.findElement(By.name("q")).sendKeys("Selenium"+ Keys.ENTER);
		// driver.findElement(By.partialLinkText("Gmail")).click();
		// driver.findElement(By.tagName("a")).click();
		clickWebElement("xpath","//a[text()='Gmail']");
		takeScreenShot();
	}

}
