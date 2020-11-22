package onlineShopping.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    tags = "@FullTest",
    features = "src/test/resources",
    glue = "onlineShopping.steps"
)

public class TestRunner {

}
