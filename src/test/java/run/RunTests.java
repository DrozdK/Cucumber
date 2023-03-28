package run;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/scenarios",
        glue = "step",
        snippets = CAMELCASE,
        plugin = { "pretty", "html:target/Homework7.html" }
)

public class RunTests {
}