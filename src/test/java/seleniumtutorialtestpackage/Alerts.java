package seleniumtutorialtestpackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
public static void main(String[] args) {
	/* we are going to learn about jsAlert, jsConfirm and jsPrompt
	 */
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("");
	
	//js alert
	//find the alert using using button property and onclick property
	driver.findElement(By.xpath("button[@onclick='jsAlert()'")).click();
	//we need to switch to the alert by using alert class in the selenium and using method switch method
	Alert alert1 = driver.switchTo().alert();
	//we can print the text available in the alert box
	System.out.println(alert1.getText());
	//we can use accept method to accept the prompt
	alert1.accept();
	
	//to verify the alert prompt operation completed successfully then use below condition
	if(driver.getPageSource().contains("----------")) {
		System.out.println("success");
	}
	System.out.println("================");
	
	//js confirm
	//find the alert using button property and onclick property and using jsconfirm() function in javascript
	driver.findElement(By.xpath("button[@onclick='jsConfirm()'")).click();
	//we need to switch to the alert by using alert class in selenium and using switch method
	Alert alert2 = driver.switchTo().alert();
	//we can print the text available in the alert box
	System.out.println(alert2.getText());
	//we can use dismiss to cancel the alert confirmation
	alert2.dismiss();
	
	//to verify the alert prompt operation completed successfully then use below condition
	if(driver.getPageSource().contains("---------------")) {
		System.out.println("success");
	}
	System.out.println("===================");
	
	//js prompt
		//find the alert using button property and onclick property and using jsPrompt() function in javascript
		driver.findElement(By.xpath("button[@onclick='jsPrompt()'")).click();
		//we need to switch to the alert by using alert class in selenium and using switch method
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Automation step by step");
		//we can use accept to enter the text in the text box provided and confirm the text
		alert3.accept();
		
		//to verify the alert prompt operation completed successfully then use below condition
		if(driver.getPageSource().contains("---------------")) {
			System.out.println("success");
		}
		System.out.println("===================");
	
	driver.close();
	driver.quit();
}
}
