package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class LeafTapsCreateLead extends LeafTapsBaseClass {
	
	@When("Click on CRMSFA link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

}
