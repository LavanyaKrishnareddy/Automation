package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testpractice1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("student");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Password123");
		WebElement submit=driver.findElement(By.id("submit"));
		submit.click();
		Thread.sleep(2000);
		driver.close();

	}

}
