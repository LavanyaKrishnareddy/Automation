package practice1;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice {
	WebDriver driver;
	@BeforeMethod
	public void beforetest() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
@Test(priority = 1)
public void testng() {
	driver.get("https://www.google.com/");
	String str=driver.getCurrentUrl();
	assertEquals("https://www.google.com/", str);
}
@Test(priority = 2,invocationCount = 3)
public void test() {
	driver.get("https://testautomationpractice.blogspot.com/");
	String str=driver.getCurrentUrl();
	assertEquals("https://testautomationpractice.blogspot.com/", str);
}
@Test(priority = 3)
public void test1() {
	driver.get("https://mega.nz/");
	String str=driver.getCurrentUrl();
	assertEquals("https://mega.nz/", str);
}
}
