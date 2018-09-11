package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC003 {
	public WebDriver driver;
	@Test
	public void testCase3() {
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("testuser3");
		driver.findElement(By.id("pass")).sendKeys("pass3");
		driver.findElement(By.xpath("//input[@id='email']")).click();
		driver.quit();
	}

}
