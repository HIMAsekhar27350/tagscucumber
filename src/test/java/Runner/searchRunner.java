package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src\\test\\java\\Features\\search.feature"},
glue = {"StepDefinitions"},
        tags = "@SmokeTest or @HimaTest ",
plugin = {"pretty","html:target/htmlreports/htmlreport.html"})

public class searchRunner  extends AbstractTestNGCucumberTests {
}
