package selenium_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		WebElement ele = driver.findElement(By.name("selenium_commands"));
		
		Select select = new Select(ele);
	/*	select.selectByIndex(5);
		Thread.sleep(3000);
		select.selectByValue("6");
		Thread.sleep(3000);
		select.selectByVisibleText("Malta");*/
		
		System.out.println(select.isMultiple());
		
		select.selectByIndex(0);
		select.selectByIndex(1);
		Thread.sleep(3000);
		//select.deselectAll();
		
		for(WebElement option :select.getOptions())
		{
			System.out.println(option.getText());
		}

		System.out.println("Selected Items");
		
		
		for(WebElement option :select.getAllSelectedOptions())
		{
			System.out.println(option.getText());
		}
		
		System.out.println(select.getFirstSelectedOption().getText());
	}	

}
