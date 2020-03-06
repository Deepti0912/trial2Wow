import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver ldriver ;

    public LoginPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//input[@id='usr']")
    @CacheLookup
    WebElement username_field ;

    @FindBy(xpath = "//input[@id='pwd']")
    @CacheLookup
    WebElement password_field ;

    @FindBy(xpath = "//input[@value='Login']")
    @CacheLookup
    WebElement login_button ;

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


}
