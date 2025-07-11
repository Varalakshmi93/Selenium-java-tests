package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClassLogin {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
					
	        driver.manage().window().maximize();
		   driver.get("https://user.aetramtrades.mu/");
		   driver.findElement(By.id("txtUserName")).sendKeys("hariprakash8667@gmail.com");
		   driver.findElement(By.id("dz-password")).sendKeys("Test");
driver.findElement(By.id("btnLoginCheck")).click();
try { Thread.sleep(3000); } catch (InterruptedException e) {}

// Assertion: check if redirected to dashboard or welcome message is shown test
String expectedUrl = "https://user.aetramtrades.mu/dashboard";
String actualUrl = driver.getCurrentUrl();
Assert.assertEquals(actualUrl, expectedUrl, "Login failed or incorrect redirection.");

driver.quit();
	}

}
