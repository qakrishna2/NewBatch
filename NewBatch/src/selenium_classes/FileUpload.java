package selenium_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ReusableMethods;

public class FileUpload {
	
	public static void main(String[] args) {
		
		WebDriver driver = ReusableMethods.initBrowser("chrome");
		driver.get("https://jqueryui.com/selectable/");
		/*driver.findElement(By.id("inputFiles")).sendKeys("G:\\PAN.JPG");*/
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.xpath("//li[text()='Item 3']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Accordion']")).click();
	}

}
