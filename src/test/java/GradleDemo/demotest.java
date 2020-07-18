package GradleDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class demotest {
	
	private WebDriver driver;
	
	
	@Test
	public void test1() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
