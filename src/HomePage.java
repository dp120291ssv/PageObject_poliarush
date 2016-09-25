import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {
	
	private WebDriver driver;

	public HomePage(FirefoxDriver driver) {
		this.driver = driver;		
	}

	public ResultPage search(String text) {
		driver.findElement(By.xpath(".//*[@id='sb_ifc0']")).sendKeys(text);		
		return new ResultPage(driver);
	}

}
