package selenium_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.ReusableMethods;

public class ActionsClass {
	
	public static void main(String[] args) {
		
		WebDriver driver = ReusableMethods.initBrowser("chrome");
		
		driver.get("https://jqueryui.com/droppable/");
	//	driver.switchTo().frame(0);

		Actions actions = new Actions(driver);
		
		//actions.moveToElement(driver.findElement(By.xpath("//a[text()='Contribute']"))).perform();
		
		//actions.contextClick(driver.findElement(By.xpath("//a[text()='Contribute']"))).perform();
		
		/*WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));*/

	//	actions.dragAndDropBy(drag,200,200).perform();
		
		//actions.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
		driver.findElement(By.name("s")).sendKeys(Keys.SHIFT+"Hello");
		//actions.keyDown(driver.findElement(By.name("s")), Keys.SHIFT).sendKeys("hello").perform();
		
	}

}
