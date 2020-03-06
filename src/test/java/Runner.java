
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java", glue = "src/test/java", strict = true, plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json",
        "html:target/home-page-html"})
public class Runner {
}
