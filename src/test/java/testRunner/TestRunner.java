package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\PAVANI\\eclipse-workspace\\cucumber_ExcelR\\Features\\Logout.feature",
                  glue="stepDefination",
                  plugin = {"pretty", "html:target/cucumber-reports"},
                  dryRun=true,
                  monochrome=true
                  )

public class TestRunner {
	
	

}
