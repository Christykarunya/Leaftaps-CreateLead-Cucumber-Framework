package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.LeafTapsBaseClass;

@CucumberOptions(features="src/test/java/features", 
				 glue="steps", 
				 monochrome= true, 
				 publish=true,
				 tags="@Leads")
				 //tags="@smoke", 
				//tags="not @regression"
				//tags="@functional and @regression"
				 //tags="@smoke or @functional or @regression"//runs all the scenarios (tags- used to categorize/group the testcases)
public class CucumberRunner extends LeafTapsBaseClass{
	
//runs from extended class - need not write any coding
	//run runner first without StepDefinition so will get code in snippet in console (copy paste snippet)
}
