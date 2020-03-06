package basePage;

import driverSetup.Setup;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage()
    {
        driver = Setup.driver;
    }
}
