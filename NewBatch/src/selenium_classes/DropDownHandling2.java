package selenium_classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandling2 {
	
public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/selectmenu/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("speed-button")).click();
		
	List<WebElement> options =	driver.findElements(By.xpath("//ul[@id='speed-menu']//li"));
	selectWebElement(options,"Fast");

}

public static void selectWebElement(List<WebElement> ele, String value)
{

	for(WebElement ele1: ele)
	{
		if(ele1.getText().equals(value))
		{
			ele1.click();
			break;
		}
	}
}

}