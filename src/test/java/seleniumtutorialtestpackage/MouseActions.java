package seleniumtutorialtestpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	/*	driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement boxA = driver.findElement(By.xpath("//li[text()= 'A' ]"));
		WebElement boxD = driver.findElement(By.xpath("//li[text()= 'D' ]"));
		
		Actions actions = new Actions(driver);
		//move the mouse cursor to an element
		actions.moveToElement(boxA);
		//click and hold mouse
		actions.clickAndHold();
		actions.moveToElement(boxD);
		//right click
		actions.contextClick(boxD);
		//double click
		actions.doubleClick(boxD);
		actions.build().perform();
		Thread.sleep(2000);	*/
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		WebElement element1 = driver.findElement(By.id("draggable"));
		WebElement element2 = driver.findElement(By.id("droppable"));
		Actions actions = new Actions(driver);
		//drag and drop action 
		actions.dragAndDrop(element1, element2);
		actions.build().perform();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Done");
	}

}
