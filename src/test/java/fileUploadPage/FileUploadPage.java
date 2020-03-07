package fileUploadPage;

import basePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage extends BasePage {

    private static final String UPLOAD_PAGE_URL = "https://filebin.net/";

    @FindBy(xpath = "//input[@class='upload']")
    @CacheLookup
    WebElement fileUpload_button ;

    public FileUploadPage(){
        PageFactory.initElements(driver, this);
    }

    public void goToFileUploadPage()
    {
        driver.get(UPLOAD_PAGE_URL);
        wait.forLoading(5);
    }

    public void fileUpload(){fileUpload_button.sendKeys("C:\\Users\\deeptim\\Desktop\\download.png");}
}
