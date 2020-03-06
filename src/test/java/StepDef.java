
import homePage.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
public class StepDef {

    public WebDriver driver;
    public HomePage homePage;
    String BaseURL = "https://www.google.com/drive/";

    @Given("^User navigates to Dropbox login page$")
    public void open_login_page() {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        driver = new ChromeDriver() ;
        homePage = new HomePage();
        driver.get(BaseURL);
    }

    @When("User enters username {string}")
    public void user_enters_username(String username) {
        homePage.setUsername(username);
    }

    @When("User enters password {string}")
    public void user_enters_password(String pwd) {
        homePage.setPwd(pwd);
    }

    @When("clicks on the login button")
    public void clicks_on_the_login_button() {
        homePage.clickLogin();
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

 */
