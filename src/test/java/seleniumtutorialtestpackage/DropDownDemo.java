package seleniumtutorialtestpackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		/*
		driver.get("https://trytestingthis.netlify.app/");
		WebElement dropdown = driver.findElement(By.id("option"));
		Select selectObject = new Select(dropdown);
		selectObject.selectByIndex(1);
		Thread.sleep(1000);
		selectObject.selectByValue("option 2");
		Thread.sleep(1000);
		selectObject.selectByVisibleText("option 3");
		*/
		/*
		//select list of options
		List<WebElement> allAvailableOptions = selectObject.getOptions();
		
		for(WebElement element : allAvailableOptions) {
			System.out.println(element.getText());
		}
		*/
		//deselect options
		driver.get("https://trytestingthis.netlify.app/");
		WebElement dropdown = driver.findElement(By.id("owc"));
		Select selectObject = new Select(dropdown);
		selectObject.selectByIndex(1);
		Thread.sleep(1000);
		selectObject.selectByValue("option 2");
		Thread.sleep(1000);
		selectObject.selectByValue("option 3");
		Thread.sleep(1000);
		selectObject.deselectByValue("option 3");
		Thread.sleep(1000);
		driver.quit();
		System.out.println("Done");
		
	}

}
