import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class Parameter {
WebDriver driver = new ChromeDriver();
	
	SoftAssert myassertion = new SoftAssert();
	
	@BeforeTest
	public void mysetup(){
	
		driver.get("https://ae.almosafer.com/");
	}
}
