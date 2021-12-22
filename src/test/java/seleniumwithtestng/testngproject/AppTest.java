package seleniumwithtestng.testngproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AppTest {
	 
	WebDriver driver;
  @BeforeTest
  public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinot\\Downloads\\softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
  }


@Test
public void testcase_1() throws InterruptedException {
	driver.navigate().to("https://neowise.examly.io/");
	Thread.sleep(5000);  
	String title = driver.getTitle();
	Assert.assertEquals(title, "NeoWise");
}


@AfterTest
public void afterTest() {
  driver.quit();
}


}
