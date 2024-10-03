package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MegaPractice {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://mega.io/");
		Thread.sleep(2000);
		WebElement Login=driver.findElement(By.xpath("//a[text()='Log in']"));
		Login.click();
		driver.findElement(By.id("login-name2")).sendKeys("satish99.marolix@gmail.com");
		driver.findElement(By.id("login-password2")).sendKeys("Mega@123");
		Thread.sleep(5000);
		WebElement remember=driver.findElement(By.id("login-check2"));	
		System.out.println(remember.isSelected());
		if(remember.isSelected()==false){
			remember.click();
		}
		else
		{
			System.out.println("Remember me is already selected");
		}
		
		driver.findElement(By.xpath("//button[@class='mega-button positive login-button large right']")).click();
		
	

	}

}
