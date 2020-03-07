package homePage;

import io.cucumber.java.en.Then;
import loginPage.LoginPage;

public class HomePageSteps {

    HomePage homePage ;

    public HomePageSteps()
    {
        this.homePage = new HomePage();
    }

    @Then("User ia able to create a new folder by the name of {string}")
    public void user_ia_able_to_create_a_new_folder_by_the_name_of(String folderName) {
        homePage.createFolder(folderName);
    }
}
