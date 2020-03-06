package homePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HomePageSteps {

    private HomePage homePage;

    public HomePageSteps()
    {
        this.homePage = new HomePage();
    }

    @Given("A user navigates to Google drive HomePage")
    public void a_user_navigates_to_Google_drive_HomePage() {
        homePage.goToHomePage();
    }

    @Then("Page tile is {string}")
    public void page_tile_is(String title) {
        Assert.assertEquals(title,homePage.getHomepageTitle());
    }
}
