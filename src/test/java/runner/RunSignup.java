package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features/signup.feature"
        , tags = "@dev"
        , glue = {"stepDefinitions", "browsers", ""}
        , plugin = {"pretty", "html:target/report_signup.html"}
)

public class RunSignup {
}