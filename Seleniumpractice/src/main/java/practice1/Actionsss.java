package practice1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {

	public static void main(String[] args) throws AWTException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.ilovepdf.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//WebElement hover=driver.findElement(By.xpath("//span[text()='Convert PDF']"));
		//Actions ac=new Actions(driver);
		//ac.moveToElement(hover).build().perform(); //---movetoElement() method is used to hover the element
		//ac.doubleClick(hover).perform();   //----doubleClick() method is used to double click the element
		//ac.contextClick(hover).perform();   //--contextClick() method is used to right click on the element
		
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//span[text()='Select WORD files']")).click();
		Robot rb=new Robot();
		rb.delay(2000);
		StringSelection ss=new StringSelection("\"C:\\Users\\lavan\\OneDrive\\Documents\\VISHAL-Sr. QA Analyst..docx\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
