package WebDriverPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Demo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> checkBoxes = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

		for (WebElement checkbox : checkBoxes) {
			if (checkbox.getDomAttribute("value").equals("sunday")|| checkbox.getDomAttribute("value").equals("saturday")) 
			{
				checkbox.click();
			}
		}
	}

}
