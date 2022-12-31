package seleniumtutorialtestpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com/");
		
		//finding the single webelement
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("who is charles babage" +Keys.ENTER);
		Thread.sleep(1000);
		driver.quit();
		//finding the multiple webelements
		
		driver.get("https://trytestingthis.netlify.app/");
		
		List<WebElement> elements = driver.findElements(By.name("Optionwithcheck[]"));
		for(WebElement element : elements) {
			System.out.println(element.getText());
		}
		Thread.sleep(1000);
		driver.quit();
		
		//how to find element within element
		driver.get("http://google.com/");
		WebElement form = driver.findElement(By.tagName("form"));
		WebElement searchBox1 = form.findElement(By.name("q"));
		searchBox1.sendKeys("Hi, how are you?" +Keys.ENTER);
		Thread.sleep(1000);
		driver.quit();
		
		//How to get active element
		driver.get("https://google.com/");
		WebElement searchBox2 = driver.findElement(By.name("q"));
		searchBox2.sendKeys("selenium" +Keys.ENTER);
		String title = driver.switchTo().activeElement().getAttribute("title");
		System.out.println(title);
		driver.quit();
		
		//How to get element tagname, css,
		driver.get("https://google.com/");
		WebElement searchBox3 = driver.findElement(By.name("q"));
		String tagName = searchBox3.getTagName();
		String textValue = searchBox3.getText();
		String cssValue = searchBox3.getCssValue("font");
		System.out.println("tagName: "+tagName+" textValue: "+textValue+" cssValue: "+cssValue);
		driver.quit();
		
		//check if element is selected?, is enabled?
		driver.get("https://google.com/");
		WebElement checkbox = driver.findElement(By.xpath("(//input@type='checkbox')[1]"));
		System.out.println(checkbox.isEnabled());
		System.out.println(checkbox.isSelected());
		driver.quit();
	}

}
