package page_object_model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page_object_model.utilities.LoggerUtil;

public class DarazEarringsPage extends BasePage {

    @FindBy(xpath= "//input[@class='ant-checkbox-input' and @businessvalue='bodhi']")
    public WebElement checkBoxBodhi;

    @FindBy(xpath= "//input[@class='ant-checkbox-input' and @businessvalue='Western']")
    public WebElement shippedFromWesternCheckBox;

    @FindBy(xpath= "//input[@class='ant-checkbox-input' and @businessvalue='7:4492']")
    public WebElement checkBoxLocalSellerWarranty;

    @FindBy(xpath ="//input[@placeholder ='Max']" )
    public WebElement textBoxMaxValue;

    @FindBy(xpath ="//input[@placeholder ='Min']" )
    public WebElement textBoxMinValue;


    public DarazEarringsPage(WebDriver driver) {
        super(driver);
    }


public void selectCheckBoxBodhi(){
    try {
        checkBoxBodhi.click();
        LoggerUtil.logInfo("Clicked on Bodhi checkbox.");
    } catch (Exception e) {
        LoggerUtil.logError("Failed to click on Bodhi checkbox.", e);

    }
}

    public void selectCheckBoxLocalSellerWarranty() {
        try {
            checkBoxLocalSellerWarranty.click();
            LoggerUtil.logInfo("Clicked on Local Seller Warranty checkbox.");
        } catch (Exception e) {
            LoggerUtil.logError("Failed to click on Local Seller Warranty checkbox.", e);
        }
    }

    public void setMaxValue(String maxValue){
        try {
            textBoxMaxValue.sendKeys(maxValue);
            LoggerUtil.logInfo("Set maximum value: " + maxValue);
        } catch (Exception e) {
            LoggerUtil.logError("Failed to set maximum value: " + maxValue, e);
        }
    }

    public void setMinValue(String minValue){
        try {
            textBoxMinValue.sendKeys(minValue);
            LoggerUtil.logInfo("Set minimum value: " + minValue);
        } catch (Exception e) {
            LoggerUtil.logError("Failed to set minimum value: " + minValue, e);
        }
    }

    public void selectCheckBoxShippedFromWestern(){
        try {
            shippedFromWesternCheckBox.click();
            LoggerUtil.logInfo("Clicked on Shipped from Western checkbox.");
        } catch (Exception e) {
            LoggerUtil.logError("Failed to click on Shipped from Western checkbox.", e);
        }
    }

    public boolean isCheckboxSelectedVoucherMax() {
        try {
            boolean isSelected = shippedFromWesternCheckBox.isSelected();
            LoggerUtil.logInfo("Shipped from Western checkbox selected status: " + isSelected);
            return isSelected;
        } catch (Exception e) {
            LoggerUtil.logError("Failed to get Shipped from Western checkbox selected status.", e);
            return false;
        }
    }

    public boolean isCheckboxSelectedBodhi() {
        try {
            boolean isSelected = checkBoxBodhi.isSelected();
            LoggerUtil.logInfo("Bodhi checkbox selected status: " + isSelected);
            return isSelected;
        } catch (Exception e) {
            LoggerUtil.logError("Failed to get Bodhi checkbox selected status.", e);
            return false;
        }
    }

    public boolean isCheckboxSelectedLocalSellerWarranty() {
        try {
            boolean isSelected = checkBoxLocalSellerWarranty.isSelected();
            LoggerUtil.logInfo("Local Seller Warranty checkbox selected status: " + isSelected);
            return isSelected;
        } catch (Exception e) {
            LoggerUtil.logError("Failed to get Local Seller Warranty checkbox selected status.", e);
            return false;
        }
    }

}
