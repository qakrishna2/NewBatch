package selenium_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ReusableMethods;

public class TableHandling {

	
	public static void main(String[] args) {
		
		
		WebDriver driver = ReusableMethods.initBrowser("chrome");
		
		driver.get("https://datatables.net/");
		
		for(int i=1;i<20;i++)
		driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+i+"]"));
	}
}
