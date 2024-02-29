package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features/topup.feature"
        , tags = "@dev"
        , glue = {"stepDefinitions", "browsers", ""}
        , plugin = {"pretty", "html:target/report_top_up.html"}
)

public class RunTopup {
}