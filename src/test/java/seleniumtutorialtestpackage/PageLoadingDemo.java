package seleniumtutorialtestpackage;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadingDemo {
	public static void main(String[] args) {
		
		//page loading strategies - NORMAL, EAGER AND NONE
		
		ChromeOptions options = new ChromeOptions();
		//NORMAL - it is used for all elements in the web page to be loaded before performing any actions
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		//EAGER - it will wait until HTML content is loaded and will not wait for CSS, images and frames to be loaded
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		//NONE - it will not wait any of web page content to be loaded
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://google.com/");
		driver.quit();
		
		
		
	}

}
