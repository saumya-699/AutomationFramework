package page_object_model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page_object_model.utilities.LoggerUtil;

public class DarazHelpPage extends BasePage {

    @FindBy(xpath= "//span[@class='next-input next-medium next-input-group-auto-width']//input")
    public WebElement helpSearchBox;

    public DarazHelpPage(WebDriver driver) {

        super(driver);
    }
    public void setHelpSearchText(String searchText) {
        try {
            helpSearchBox.sendKeys(searchText);
            LoggerUtil.logInfo("Entered search text: " + searchText + " into Help Search Box.");
        } catch (Exception e) {
            LoggerUtil.logError("Failed to enter search text into Help Search Box.", e);
        }
    }

}
