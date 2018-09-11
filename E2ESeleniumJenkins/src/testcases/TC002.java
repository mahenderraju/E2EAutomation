package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC002 {
	public WebDriver driver;
	@Test
	public void testCase2() {
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("testuser2");
		driver.findElement(By.id("pass")).sendKeys("pass3");
		driver.findElement(By.xpath("//input[@id='email']")).click();
		driver.quit();
	}

}
