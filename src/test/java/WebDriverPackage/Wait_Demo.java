package WebDriverPackage;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Demo {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		
		//WebDriver wait 
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"username\"]")))
		.sendKeys("admin");
		
		//Fluent wait 
		 Wait<WebDriver> Fwait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofSeconds(5))
			       .ignoring(NoSuchElementException.class);
		 Fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]"))).sendKeys("password123");
	}

}
