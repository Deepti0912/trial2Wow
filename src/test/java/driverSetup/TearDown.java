package driverSetup;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TearDown {

    private WebDriver driver;

    public TearDown() {
        this.driver = Setup.driver;
    }

    @After
    public void quitDriver(Scenario scenario) throws InterruptedException {
        Thread.sleep(5000);
        if(scenario.isFailed()){
            saveScreenshotsForScenario(scenario);
        }
        this.driver.quit();
    }

    private void saveScreenshotsForScenario(final Scenario scenario) {

        final byte[] screenshot = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    }
}
