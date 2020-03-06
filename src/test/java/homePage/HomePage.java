package homePage;

import basePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    private static final String HOME_PAGE_URL = "https://depositfiles.com/";

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='main']/div[1]/div[1]/a/strong")
    @CacheLookup
    WebElement sign_button ;

    @FindBy(xpath = "//*[@id='login_frm']/table/tbody/tr[4]/td/input")
    @CacheLookup
    WebElement username_field ;

    @FindBy(xpath = "//*[@id='login_frm']/table/tbody/tr[5]/td/input")
    @CacheLookup
    WebElement password_field ;

    @FindBy(xpath = "//*[@id='login_btn']")
    @CacheLookup
    WebElement enter_button ;  //*[@id='login_btn']


    public void goToHomePage()
    {
        driver.get(HOME_PAGE_URL);
    }

    public void clickSign(){
        sign_button.click();
    }

    public void setUsername(String username){
        username_field.clear();
        username_field.sendKeys(username);
    }

    public void setPwd(String pwd){
        password_field.clear();
        password_field.sendKeys(pwd);
    }

    public void EnterClick(){enter_button.click();}

    public String getHomepageTitle(){
        return driver.getTitle();
    }


}
