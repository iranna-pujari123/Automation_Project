package WebDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_Demo {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
	}

}
