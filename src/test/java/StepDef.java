
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDef {

    public WebDriver driver;

    public LoginPage loginPage ;

    @Given("^open google page$")
    public void open_google_page() {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        driver = new ChromeDriver() ;
        loginPage = new LoginPage(driver);
        driver.get("http://testing-ground.scraping.pro/login");
    }

    @When("User enters username {string}")
    public void user_enters_username(String username) {
        loginPage.setUsername(username);
    }

    @When("User enters password {string}")
    public void user_enters_password(String pwd) {
        loginPage.setPwd(pwd);
    }

    @When("clicks on the login button")
    public void clicks_on_the_login_button() {
        loginPage.clickLogin();
    }

    @Then("user should be able to successfully login")
    public void user_should_be_able_to_successfully_login () {
        if (driver.getPageSource().contains("ACCESS DENIED!")) {
            Assert.assertTrue("Login failed", false);
        } else{
            Assert.assertTrue("Login success", true);
        }
        driver.close();

    }

}
