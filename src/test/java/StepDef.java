
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class StepDef {
    private final String BaseURL = "https://www.dropbox.com/login";
    private final String pageTitle = "DropBox";

//    @FindBy(xpath = "//input[@name='login_email']")
    @FindBy(xpath = "//input[@id='usr']")
    WebElement username_field ;

//    @FindBy(xpath = "//input[@name='login_password']")
    @FindBy(xpath = "//input[@id='pwd']")
    WebElement password_field ;

//    @FindBy(xpath = "//input[@name='login_email']")
    @FindBy(xpath = "//input[@value='Login']")
    WebElement login_button ;

    WebDriver driver;

    @Given("^open google page$")
    public void open_Browser(){

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testing-ground.scraping.pro/login");
        System.out.println("Page title" + driver.getTitle());

    }

     @When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_details(String username, String password){

         username_field.sendKeys(username);
         password_field.sendKeys(password);
         login_button.click();
    }

     @Then("^Close browser$")
            public void closeBrowser(){
            driver.close();
}




}
