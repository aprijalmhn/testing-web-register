package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        tags = "@Register",
        features="classpath:Features",
        glue= {"StepDef"},
        plugin ={"pretty","json:target/cucumber.json"},
        publish = true,
        monochrome = true
)

public class TestRunner {
}
