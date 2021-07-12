package selenium_classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchBox = driver
				.findElement(By.xpath("(//input[@name='btnI'])[2]//preceding-sibling::input//preceding::input[3]"));
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		searchBox.sendKeys("Hello");
		Thread.sleep(3000);
		searchBox.clear();

		System.out.println("url: "+gmail.getAttribute("href"));
		System.out.println("Css Value: "+gmail.getCssValue("line-height"));
		System.out.println("Tag Name: "+gmail.getTagName());
		System.out.println("Css Value: "+gmail.getText());
		System.out.println("Css Value: "+gmail.isDisplayed());
		System.out.println("Css Value: "+gmail.isEnabled());
		System.out.println("Css Value: "+gmail.isSelected());
		//gmail.click();
		
		//findElements
		
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		System.out.println(ele.size());
		
		for(WebElement link :ele)//30
		{
			
			System.out.println(link.getText()+"\t"+link.getAttribute("href"));
		}
		







	}
}
