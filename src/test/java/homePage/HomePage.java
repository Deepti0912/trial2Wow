package homePage;

import basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='ue-effect-container uee-AppActionsView-SecondaryActionMenu-text-new-folder']")
    @CacheLookup
    WebElement newFolderMenu ;

    @FindBy(xpath = "//input[@class='cdm-create-folder-modal__content-name new-folder-input valid mc-input']")
    @CacheLookup
    WebElement folderNameTextBox ;

    public void createFolder(String folderName){
        
         wait.forElementToBeDisplayed(10, newFolderMenu, "new folder" );

 //       wait.forLoading(20);
   //     newFolderMenu.click();
      //  folderNameTextBox.sendKeys(folderName);
    }
}
