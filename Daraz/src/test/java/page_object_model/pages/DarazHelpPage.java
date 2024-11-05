package page_object_model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class DarazHelpPage extends BasePage {

    @FindBy(xpath= "//span[@class='next-input next-medium next-input-group-auto-width']//input")
    public WebElement helpSearchBox;

    public DarazHelpPage(WebDriver driver) {
        super(driver);
    }
    public void setHelpSearchText(String searchText) {
        helpSearchBox.sendKeys(searchText);
    }
}
