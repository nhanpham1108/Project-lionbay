package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features/login.feature"
        , tags = "@dev or @prod"
        , glue = {"stepDefinitions", "browsers", ""}
        , plugin = {"pretty", "html:target/report_login.html"}
)

public class RunLogin {
}