package loginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPageSteps {

    private LoginPage loginPage;

    public LoginPageSteps()
    {
        this.loginPage = new LoginPage();
    }

    @Given("User enters username {string} and password {string} on DropBox site")
    public void user_enters_username_and_password_on_DropBox_site(String username, String password) {
        loginPage.goToHomePage();
        loginPage.setUsername(username);
        loginPage.setPwd(password);
        loginPage.clickLogin();
    }

    @Then("User is able to successfully login")
    public void user_is_able_to_successfully_login() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
