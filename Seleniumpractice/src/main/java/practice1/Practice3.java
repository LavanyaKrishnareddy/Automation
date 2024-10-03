package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(2000);
		driver.findElement(By.id("input-email")).sendKeys("lavanyakrishnareddie@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("input-password")).sendKeys("Lav.krishna@2997");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		
	}

}
