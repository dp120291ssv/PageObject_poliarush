
import java.util.concurrent.TimeUnit;
import org.testng.Assert;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTestPage {
	private FirefoxDriver driver;
	
	@BeforeTest
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://google.com.ua");
	}
	
	@AfterTest
	public void tearDown(){		
		driver.close();
	}
	@Test
	public void testSearch(){
		HomePage home = new HomePage(driver);		
		ResultPage result = home.search("automated testing info");
		Assert.assertTrue(result.getFirstLink().contains("automated"));
	}

}
