package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json", "html:target/reports/"},
        //format={"pretty","html:reports/test-report"},
        features = "src/test/resources/features",
        tags = {"~@ignore"},
        glue = {"steps"}
)
public class RunCucumberTest {
}