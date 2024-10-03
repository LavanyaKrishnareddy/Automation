package practice1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestingPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		WebElement Name= driver.findElement(By.id("name"));
		Name.sendKeys("Lavanya Krishnareddy");
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys("lavanyakrishnareddie@gmail.com");
		WebElement Phone=driver.findElement(By.id("phone"));
		Phone.sendKeys("9553784528");
		WebElement Address=driver.findElement(By.id("textarea"));
		Address.sendKeys("1-4-67, Near TTD, Thummur, Naidupeta,524126");
		WebElement Gender=driver.findElement(By.id("male"));
		Gender.click();
		List<WebElement> Days=driver.findElements(By.xpath("//div[@class='form-check form-check-inline']"));
		int dayslength=Days.size();
		for(int i=2;i<dayslength;i++) 
		{
			if(!(Days.get(i).getText().equalsIgnoreCase("saturday")||Days.get(i).getText().equalsIgnoreCase("sunday")))
			{
				Days.get(i).click();
			}
		}
//		for(WebElement Day:Days) {
//			if(!((Day.getText().equalsIgnoreCase("saturday"))||(Day.getText().equalsIgnoreCase("sunday"))))
//			{
//				Day.click();
//			}
//		}
		Select country= new Select(driver.findElement(By.id("country")));
		//Country.selectByIndex(3);
		country.selectByValue("france");
		Actions oc=new Actions(driver);
		WebElement opencart=driver.findElement(By.xpath("//a[text()='open cart          ']"));
		//Actions oc=new Actions(driver);
		//oc.contextClick(opencart).build().perform();
		oc.moveToElement(opencart).build().perform();
		//oc.moveByOffset(opencart,orangehrm).click().build().perform();
        
		
		//DateSelection
//		driver.findElement(By.id("datepicker")).click();
//		for(int i=0;;i++) {
//			WebElement month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
//			WebElement year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
//			if(month.getText().equalsIgnoreCase("June")&&year.getText().equalsIgnoreCase("1997")) {
//				WebElement date=driver.findElement(By.xpath("//a[text()='29'][1]"));
//				date.click();
//				break;
//			}
//			else {
//				driver.findElement(By.xpath("//span[text()='Prev'][1]")).click();
//			}
//		}
		//alert
//		driver.findElement(By.xpath("//button[text()='Alert']")).click();
//		Alert alert=driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.accept();
//		
//		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
//		Alert alert1=driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert1.dismiss();
//		
//		driver.findElement(By.xpath("//button[text()='Prompt']")).click();
//		Alert alert2=driver.switchTo().alert();
//		Thread.sleep(2000);
//		System.out.println(alert2.getText());
//		alert2.sendKeys("krishna");
//		alert2.accept();
		
		
		//frames
		
		

		
		
		
	}

}
