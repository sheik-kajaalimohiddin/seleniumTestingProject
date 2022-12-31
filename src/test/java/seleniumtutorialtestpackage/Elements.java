package seleniumtutorialtestpackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {
	
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver  driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.get("http://www.google.com");
	//single element locators
	/*WebElement searchBox = driver.findElement(By.name("q"));
	searchBox.sendKeys("ABCD", Keys.ENTER);*/
	//multiple element locators
	/*
	driver.navigate().to("https://trytestingthis.netlify.app/");
	List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
	
	for(WebElement element : options) {
		System.out.println(element.getText());
	}
	*/
	driver.navigate().to("https://team2advancehomerealestates.herokuapp.com/");
	
	Thread.sleep(2000);
	driver.close();
}
}
