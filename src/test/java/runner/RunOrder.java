package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features/order.feature"
        , tags = "@dev"
        , glue = {"stepDefinitions", "browsers", ""}
        , plugin = {"pretty", "html:target/report_order.html"}
)

public class RunOrder {
}