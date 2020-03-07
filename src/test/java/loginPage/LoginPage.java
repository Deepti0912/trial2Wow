package loginPage;

import basePage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.rmi.server.UID;
import java.sql.Driver;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

    private static final String HOME_PAGE_URL = "https://account.box.com/login";
    private static final String HOME_PAGE_TITLE = "Login - Dropbox";

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='login-email']")
    @CacheLookup
    WebElement username_field ;

    @FindBy(xpath = "//*[@id='login-submit']")
    @CacheLookup
    WebElement username_NextButton ;

    @FindBy(xpath = "//input[@id='password-login']")
    @CacheLookup
    WebElement password_field ;

    @FindBy(xpath = "//button[@id='login-submit-password']")
    @CacheLookup
    WebElement login_button ;

    @FindBy(xpath = "//*[@class='files-page-button-label']")
    @CacheLookup
    WebElement newMenu ;

    @FindBy(xpath = "//*[text()='Folder']")
    @CacheLookup
    WebElement newFolder ;

    //create folder pop up box
    @FindBy(xpath = "//input[@name='folder-name']")
    @CacheLookup
    WebElement newFolder_input ;

    @FindBy(xpath = "//*[text()='Create']")
    @CacheLookup
    WebElement newFolder_CreateButton ;

    @FindBy(xpath = "//*[text()='Upload']")
    @CacheLookup
    WebElement uploadBtn;

    public void goToHomePage()
    {
        driver.get(HOME_PAGE_URL);
        wait.forLoading(5);
    }


    public void setUsername(String username){
        username_field.clear();
        username_field.sendKeys(username);
        username_NextButton.click();
    }

    public void setPwd(String pwd){
        password_field.clear();
        password_field.sendKeys(pwd);
    }

    public void clickLogin(){
        login_button.click();
    }

    public void checkTitle(){

        String actualTitle = driver.getTitle();
    }

    public void createNewFolderAndUploadAFile() throws InterruptedException {
        newMenu.click();
        newFolder.click();

        Random objGenerator = new Random();
        int randomNumber = objGenerator.nextInt(100);
        String testFolder = "Test" + Integer.toString(randomNumber);
        newFolder_input.sendKeys(testFolder);
        newFolder_CreateButton.click();

        WebElement uploadFolder = driver.findElement(By.xpath("//a[text()='" + testFolder + "']"));
        uploadFolder.click();

       // uploadBtn.click();
        Actions actions = new Actions(driver);
        WebElement elementLocator = uploadBtn;

        actions.clickAndHold(elementLocator);
               // (elementLocator).perform();



    }





}
