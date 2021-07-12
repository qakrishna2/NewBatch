package selenium_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import utils.ReusableMethods;

public class JavaScript {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =ReusableMethods.initBrowser("chrome");
		
		driver.get("https://jqueryui.com/");
		
		Thread.sleep(3000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		//js.executeScript("window.scrollBy(0,900)");
       // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("document.getElementsByName('s')[0].style.border='5px solid green'");

	}
	
	static void test(int...a)
	{
		for(int s : a)
		{
			System.out.println(a);
		}
	}

}
