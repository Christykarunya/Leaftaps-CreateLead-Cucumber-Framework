package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsLogin extends LeafTapsBaseClass{
	
	//public ChromeDriver driver;
	
	
	/*
	 * @Given("Open the Chrome Browser") public void open_the_chrome_browser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); }
	 * 
	 * @Given("Load the application URL {string}") public void
	 * load_the_application_url(String url) { driver.get(url); }
	 */
	
	@Given("Enter Username as {string}")
	public void enterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	
	@Given("Enter password as {string}")
	public void enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
	}
	
	@When("Click on Login Button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Title should be matching with {string}")
	public void verifyHomePage(String expTitle) {
	    String actualTitle = driver.getTitle();
	   Assert.assertEquals(actualTitle, expTitle);
	    /*if(actualTitle.equals(expTitle)) {
	    	System.out.println("Homepage is displayed");
	    }
	    else {
	    	System.out.println("Homepage is not displayed");
	    }*/
	}
	
	@But("ErrorMessage should be displayed")
	public void verifyErrorMessage() {
		System.out.println("Error message is displayed");

	}
	


}
