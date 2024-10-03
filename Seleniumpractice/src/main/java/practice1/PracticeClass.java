package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeClass {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://mvnrepository.c"om/artifact/org.seleniumhq.selenium/selenium-java/4.23.1");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement Username=driver.findElement(By.name("username"));
		//Username.click();
		Username.sendKeys("Admin");
		Thread.sleep(2000);
		//driver.navigate().back();
		Thread.sleep(2000);
		WebElement Password=driver.findElement(By.name("password"));
		//Password.click();
		Password.sendKeys("admin123");
		//driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
		//Search.sendKeys("selenium architecture");
		//driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
		
		//driver.manage().window().minimize();
		//driver.close();
	}
}
