package steps;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
/*
 *Hooks implementation not required. Can use TestNG directly in BaseClassand extend it to CucumberRunner
public class HooksImplementation extends LeafTapsBaseClass{
	
	@Before
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); //driver is initialized here
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps");
		
	}
	
	@After
	public void postCondition() {
		driver.close();

	}
	
}*/
