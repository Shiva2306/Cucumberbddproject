package nammarunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"C:\\Users\\shiva\\Documents\\workspace-spring-tool-suite-4-4.22.1.RELEASE\\Cucumberbddproject\\nammafeatures\\nammalogin.feature", 
		"C:\\Users\\shiva\\Documents\\workspace-spring-tool-suite-4-4.22.1.RELEASE\\Cucumberbddproject\\nammafeatures\\support.feature"},
glue = {"nammastepdefinitions"},
plugin = {"pretty", "html:target/cucumber-reports"},
monochrome = true,
dryRun=false,
publish = true)

public class NammaTestRunner extends AbstractTestNGCucumberTests {
	
	/*   @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    } */
	
	//plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},

}
