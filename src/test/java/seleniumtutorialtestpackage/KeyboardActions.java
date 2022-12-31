package seleniumtutorialtestpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//how to stimulate keyboard typing
		//sendKeys()
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium" +Keys.ENTER);
		Thread.sleep(1000);
		//driver.quit();
		
		//how to stimulate pressing key combinations
		//keyDown()
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium" +Keys.ENTER);
		Actions actionProvider = new Actions(driver);
		Action keyDown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
		keyDown.perform();
		Thread.sleep(1000);
		//driver.quit();
		
		//keyUp()
		driver.get("https://google.com/");
		Actions actions = new Actions(driver);
		WebElement searchBox = driver.findElement(By.name("q"));
		actions.keyDown(Keys.LEFT_SHIFT).sendKeys(searchBox, "selenium").keyUp(Keys.LEFT_SHIFT).sendKeys("selenium").build().perform();
		Thread.sleep(2000);
		//clear()
		//using clear() we can clear the data entered in the search box
		searchBox.clear();
		driver.quit();
	}

}
