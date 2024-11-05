package page_object_model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


        searchBox.sendKeys(searchText);
    }

    public <T> T clickSearchButton() {
        searchButton.click();

        if (visibleText.equals("Earrings")) {
            return (T) PageFactory.initElements(driver, DarazEarringsPage.class);
        } else if (visibleText.equals("Flowers")) {
            return (T) PageFactory.initElements(driver, DarazFlowersPage.class);
        } else {
            return (T) PageFactory.initElements(driver, DarazFansPage.class);
        }
    }

    public void clickHelpAndSupport() {

        helpAndSupport.click();
    }

    public DarazHelpPage clickSelectHelpCenterHref() {
        selectHelpCenterHref.click();
        return PageFactory.initElements(driver, DarazHelpPage.class);
    }
}