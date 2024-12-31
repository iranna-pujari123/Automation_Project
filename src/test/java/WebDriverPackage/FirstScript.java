package WebDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
     //open browser
		WebDriver driver= new ChromeDriver();
		//open URL
		driver.get("https://javabykiran.com/selenium/login.html");
		
		WebElement txtUsedrname=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		txtUsedrname.sendKeys("admin");
		
		WebElement txtPassword=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		txtPassword.sendKeys("password123");
		
		WebElement btnLogin=   driver.findElement(By.xpath("//*[@id=\"login-form\"]/button"));

		btnLogin.click();
	}

}
