package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

		public static void main(String[] args) throws Throwable {
			WebDriver driver;
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			WebElement search=driver.findElement(By.id("APjFqb"));
			search.sendKeys("Selenium Webdriver");
			List<WebElement> dropdown=driver.findElements(By.xpath("//div[@class='eIPGRd']"));
			for(WebElement drop:dropdown)
			{
				if(drop.getText().equalsIgnoreCase("selenium webdriver"))
				{
					drop.click();
				}
			}

	}

}
