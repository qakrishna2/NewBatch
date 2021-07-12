package selenium_classes;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.eenadu.net/");
		
		driver.findElement(By.xpath("//a[@title='eenadu feedback']")).click();
		
		//String currentWindow =driver.getWindowHandle();
		Set<String> allOpenWindows = driver.getWindowHandles();
		
		for(String s : allOpenWindows)
		{
			
				driver.switchTo().window(s);
				if(driver.getTitle().equals("Eenadu.net Feedback"))
				{
					break;
				}
				
		}
		
		driver.findElement(By.id("txtname")).sendKeys("Automation");
		
}

}
