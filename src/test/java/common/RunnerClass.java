package common;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			plugin = {"pretty", "html:target/SauceDemo.html"}, //reporting purpose
			monochrome=false,  //console output color
			//tags = "@tag or @leaveScenario", //tags from feature file
			features = {"src/test/resources/FeatureFiles"}, //location of feature files
			glue= {"sauceDemo_Pages"}) //location of step definition files


	public class RunnerClass extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
					
			return super.scenarios();
	    }


}