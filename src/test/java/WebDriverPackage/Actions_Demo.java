package WebDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Demo {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("Pke_EE")).sendKeys("laptop");
		Actions ac= new Actions(driver);
		//ac.sendKeys(Keys.ENTER).perform();
		
		//ac.moveToElement(driver.findElement(By.linkText("Myntra"))).perform();
		//ac.scrollToElement(driver.findElement(By.linkText("Myntra"))).perform();

	}

}
