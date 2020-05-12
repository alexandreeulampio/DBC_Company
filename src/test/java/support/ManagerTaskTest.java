package support;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/Investir.feature", glue = { "steps" }, monochrome = true, dryRun = false)

public class ManagerTaskTest {
}
