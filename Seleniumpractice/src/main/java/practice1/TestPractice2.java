package practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestPractice2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
//		List<WebElement> elements=driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
//		System.out.println(elements.size());
//		for(WebElement el:elements) {
//			Thread.sleep(2000);
//			if(el.getText().equalsIgnoreCase("laptop apple")) {
//				el.click();
//			}
//				
//		}
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		Select sel=new Select(dropdown);
		sel.selectByVisibleText("Baby");
		
		
//		//driver.findElement(By.id("username")).sendKeys("lavanyakrishnareddie@gmail.com");
//	//	driver.findElement(By.id("password")).sendKeys("Lav.krishna@29061997");
////		driver.findElement(By.xpath("//input[@value='Login']")).click();
////		driver.findElement(By.xpath("//a[text()='Shop']")).click();
////		Thread.sleep(2000);
////		//driver.findElement(By.xpath("//a[@data-product_id='181']")).click();
////		driver.findElement(By.xpath("//span[@class='cartcontents']")).click();
////		driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();
//		driver.findElement(By.id("billing_first_name")).sendKeys("lavanya");
//		driver.findElement(By.id("billing_last_name")).sendKeys("krishna");
//		driver.findElement(By.id("billing_company")).sendKeys("Valuelabs");
//		driver.findElement(By.id("billing_phone")).sendKeys("9553784528");
//		driver.findElement(By.id("billing_address_1")).sendKeys("Near TTD,Thummur village");
//		driver.findElement(By.id("billing_city")).sendKeys("Naidupeta");
//		driver.findElement(By.id("billing_postcode")).sendKeys("524126");
//		driver.findElement(By.id("s2id_autogen1_search")).sendKeys("India");

	}

}
