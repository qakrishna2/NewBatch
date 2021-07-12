package selenium_classes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.apsrtconline.in/oprs-web/");
		WebElement ele = 	driver.findElement(By.id("searchBtn"));
		ele.click();
		//alert open
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("NANDYAL");
		Alert alert1 = driver.switchTo().alert();

}
}