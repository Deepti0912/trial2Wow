package homePage;

import basePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    private static final String HOME_PAGE_URL = "https://www.dropbox.com/login";

    public HomePage(){
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

    public String getHomepageTitle(){
        return driver.getTitle();
    }


}
