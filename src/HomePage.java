import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {
	
	private WebDriver driver;

	public HomePage(FirefoxDriver driver) {
		this.driver = driver;
		
	}

	public ResultPage search(String string) {
		driver.findElement(By.xpath("")),sendKeys(arg0);		
		return new ResultPage();
	}

}
