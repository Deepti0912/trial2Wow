package homePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSteps {

    private HomePage homePage;

    public HomePageSteps()
    {
        this.homePage = new HomePage();
    }

    @Given("User navigates to Drop Box login Page")
    public void a_user_navigates_to_Google_drive_HomePage() { homePage.goToHomePage(); }

    @When("User enters username {string}")
    public void user_adds_username(String username) { homePage.setUsername(username);
    }

    @When("User enters password {string}")
    public void user_enters_password(String pwd) { homePage.setPwd(pwd); }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() { homePage.clickLogin();}
}
