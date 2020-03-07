package loginPage;

import basePage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    private static final String HOME_PAGE_URL = "https://www.dropbox.com/login";
    private static final String HOME_PAGE_TITLE = "Login - Dropbox";

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='login_email']")
    @CacheLookup
    WebElement username_field ;

    @FindBy(xpath = "//input[@name='login_password']")
    @CacheLookup
    WebElement password_field ;

    @FindBy(xpath = "//div[@class='signin-text']")
    @CacheLookup
    WebElement login_button ;

    public void goToHomePage()
    {
        driver.get(HOME_PAGE_URL);
        wait.forLoading(5);
    }

    public void setUsername(String username){
        username_field.clear();
        username_field.sendKeys(username);
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
        Assert.assertEquals(HOME_PAGE_TITLE, actualTitle);
    }


}
