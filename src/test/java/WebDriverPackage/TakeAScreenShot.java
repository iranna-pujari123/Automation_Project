package WebDriverPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeAScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/subcategories.html");
//		
//		TakesScreenshot as=(TakesScreenshot)driver;
//	    File file= as.getScreenshotAs(OutputType.FILE);
//	    File fl= new File(".‪//screnShots//SubCategory.png");
//	    
//	    FileUtils.copyFile(file, fl);
		
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]"));

		File file=ele.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".//screnshots//WebElement.png"));
	}

}
