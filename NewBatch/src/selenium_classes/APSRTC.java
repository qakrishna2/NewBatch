package selenium_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class APSRTC {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apsrtconline.in");
		driver.findElement(By.xpath("//*[text()='eTicket Login']")).click();
		driver.findElement(By.id("userName")).sendKeys("TEXT");
}	
}
