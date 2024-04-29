package testRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\PAVANI\\eclipse-workspace\\cucumber_ExcelR\\Features\\tags.feature",
                  glue="stepDefination",
                  plugin = {"pretty", "html:target/cucumber-reports"},
                  dryRun=true,
                  monochrome=false,
                  tags="@sanity"
                  )

public class TstRunner {
	

}
