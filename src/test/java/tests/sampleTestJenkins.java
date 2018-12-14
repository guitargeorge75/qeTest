package tests;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sampleTestJenkins {

	private static WebDriver Driver;
	
	
	
	@BeforeClass
	public static void SetupScripts() {
		WebDriverManager.chromedriver().setup();
	}
	
	
	@BeforeMethod
	public void createDriver() {
		Driver = new ChromeDriver();
	}
	
	@AfterClass
	public static void destroyDriver() {
		if(Driver != null) {
			Driver.quit();
		}
	}
	
	@Test
	public void testMyApp() {
		Driver.get("http://guitargeorge75.com");
		/*try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		WebElement header = Driver.findElement(By.xpath("//h3"));
		//System.out.println(header.getText());
		assertEquals(header.getText(),"Hello, welcome to the world of guitargeorge75");
	}
	
	
	
	
}
