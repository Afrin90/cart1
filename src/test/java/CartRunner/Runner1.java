package CartRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Feature_folder"},
plugin = {"json:target/cucumber.json"},
glue = "CartStepDefinition")//tags = {"@Sanity"})

public class Runner1 extends AbstractTestNGCucumberTests{

}
