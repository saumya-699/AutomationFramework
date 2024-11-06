package page_object_model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page_object_model.utilities.LoggerUtil;

public class DarazHomePage extends BasePage {

    @FindBy(xpath = "//input[@placeholder='Search in Daraz']")
    public WebElement searchBox;

    @FindBy(xpath = "//a[@tabindex='2']")
    public WebElement searchButton;

    @FindBy(xpath = "//span[text()= 'Help & Support']")
    public WebElement helpAndSupport;

    @FindBy(xpath = " //a[text()='Help Center']")
    public WebElement selectHelpCenterHref;


    String visibleText = "";

    public DarazHomePage(WebDriver driver) {
        super(driver);
    }


public void setSearchText(String searchText) {
    try {
        this.visibleText = searchText;
        searchBox.sendKeys(searchText);
    } catch (Exception e) {
        LoggerUtil.logError("Error setting search text: " + searchText, e);
    }
}

    public <T> T clickSearchButton() {
        try {
            searchButton.click();

            if (visibleText.equals("Earrings")) {
                return (T) PageFactory.initElements(driver, DarazEarringsPage.class);
            } else if (visibleText.equals("Flowers")) {
                return (T) PageFactory.initElements(driver, DarazFlowersPage.class);
            } else {
                return (T) PageFactory.initElements(driver, DarazFansPage.class);
            }
        } catch (Exception e) {
            LoggerUtil.logError("Error clicking search button for visibleText: " + visibleText, e);
            return null;
        }
    }

    public void clickHelpAndSupport() {
        try {
            helpAndSupport.click();
        } catch (Exception e) {
            LoggerUtil.logError("Error clicking Help and Support", e);
        }
    }

    public DarazHelpPage clickSelectHelpCenterHref() {
        try {
            selectHelpCenterHref.click();
            return PageFactory.initElements(driver, DarazHelpPage.class);
        } catch (Exception e) {
            LoggerUtil.logError("Error clicking Select Help Center Href", e);
            return null;
        }
    }

}