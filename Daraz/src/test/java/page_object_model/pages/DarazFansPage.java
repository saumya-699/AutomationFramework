
package page_object_model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page_object_model.utilities.LoggerUtil;

public class DarazFansPage extends BasePage {


    @FindBy(xpath= "//input[@class='ant-checkbox-input' and @businessvalue='aiko']")
    public WebElement aikoCheckBox;

    @FindBy(xpath= "//input[@class='ant-checkbox-input' and @businessvalue='7:201045']")
    public WebElement brandWarrantyCheckbox;

    @FindBy(xpath= "//input[@class='ant-checkbox-input' and @businessvalue='8:4443']")
    public WebElement WarrantyPeriodCheckbox;


    public DarazFansPage(WebDriver driver) {
        super(driver);
    }

    public void selectBrandWarrantyCheckbox() {
        try {
            brandWarrantyCheckbox.click();
            LoggerUtil.logInfo("Clicked on Brand Warranty checkbox.");
        } catch (Exception e) {
            LoggerUtil.logError("Failed to click on Brand Warranty checkbox.", e);
        }
    }

    public void selectWarrantyPeriodCheckbox() {
        try {
            WarrantyPeriodCheckbox.click();
            LoggerUtil.logInfo("Clicked on Warranty Period checkbox.");
        } catch (Exception e) {
            LoggerUtil.logError("Failed to click on Warranty Period checkbox.", e);
        }
    }

    public boolean isCheckboxSelectedBrandWarranty() {
        try {
            boolean isSelected = brandWarrantyCheckbox.isSelected();
            LoggerUtil.logInfo("Brand Warranty checkbox selected status: " + isSelected);
            return isSelected;
        } catch (Exception e) {
            LoggerUtil.logError("Failed to get Brand Warranty checkbox selected status.", e);
            return false;
        }
    }

}
