package fileUploadPage;

import basePage.BasePage;
import homePage.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FileUploadSteps  {

    private FileUploadPage fileUploadPage;

    public FileUploadSteps()
    {
        this.fileUploadPage = new FileUploadPage();
    }

    @Given("User navigates to File upload site")
    public void user_navigates_to_File_upload_site() {
        fileUploadPage.goToFileUploadPage();
    }

    @When("User clicks on upload file button")
    public void user_clicks_on_upload_file_button() {
        fileUploadPage.fileUpload();
    }


}
