package page_object_model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page_object_model.utilities.LoggerUtil;

public class DarazFlowersPage extends BasePage {


    @FindBy(xpath = "//input[@class='ant-checkbox-input' and @businessvalue='echidna-123423045']")
    public WebElement checkBoxECHIDNA;

    @FindBy(xpath = "//input[@class='ant-checkbox-input' and @businessvalue='30129:1577']")
    public WebElement checkBoxRed;

    @FindBy(xpath = "//input[@class='ant-checkbox-input' and @businessvalue='31136:3848']")
    public WebElement checkBoxModernStyle;

    @FindBy(xpath = "//input[@class='ant-checkbox-input' and @businessvalue='40205:159322']")
    public WebElement checkBoxHandWork;

    @FindBy(xpath = "//input[@class='ant-checkbox-input' and @businessvalue='30129:3740']")
    public WebElement checkBoxPurple;

    @FindBy(xpath = "//input[@class='ant-checkbox-input' and @businessvalue='Central']")
    public WebElement shippedFromCentralCheckBox;


    public DarazFlowersPage(WebDriver driver) {
        super(driver);
    }

    public void selectCheckboxECHIDNA() {
        try {
            checkBoxECHIDNA.click();
            LoggerUtil.logInfo("Clicked on ECHIDNA checkbox.");
        } catch (Exception e) {
            LoggerUtil.logError("Failed to click on ECHIDNA checkbox.", e);
        }
    }

    public void selectCheckBoxRed() {
        try {
            checkBoxRed.click();
            LoggerUtil.logInfo("Clicked on Red checkbox.");
        } catch (Exception e) {
            LoggerUtil.logError("Failed to click on Red checkbox.", e);
        }
    }

    public void selectCheckBoxShippedFromCentral() {
        try {
            shippedFromCentralCheckBox.click();
            LoggerUtil.logInfo("Clicked on Shipped from Central checkbox.");
        } catch (Exception e) {
            LoggerUtil.logError("Failed to click on Shipped from Central checkbox.", e);
        }
    }

    public void selectCheckBoxPurple() {
        try {
            checkBoxPurple.click();
            LoggerUtil.logInfo("Clicked on Purple checkbox.");
        } catch (Exception e) {
            LoggerUtil.logError("Failed to click on Purple checkbox.", e);
        }
    }

    public boolean isCheckBoxSelectedRed() {
        try {
            boolean isSelected = checkBoxRed.isSelected();
            LoggerUtil.logInfo("Red checkbox selected status: " + isSelected);
            return isSelected;
        } catch (Exception e) {
            LoggerUtil.logError("Failed to get Red checkbox selected status.", e);
            return false;
        }
    }

    public boolean isCheckBoxSelectedPurple() {
        try {
            boolean isSelected = checkBoxPurple.isSelected();
            LoggerUtil.logInfo("Purple checkbox selected status: " + isSelected);
            return isSelected;
        } catch (Exception e) {
            LoggerUtil.logError("Failed to get Purple checkbox selected status.", e);
            return false;
        }
    }

    public boolean isCheckBoxSelectedShippedFromCentral() {
        try {
            boolean isSelected = shippedFromCentralCheckBox.isSelected();
            LoggerUtil.logInfo("Shipped from Central checkbox selected status: " + isSelected);
            return isSelected;
        } catch (Exception e) {
            LoggerUtil.logError("Failed to get Shipped from Central checkbox selected status.", e);
            return false;
        }
    }

    public boolean isCheckBoxSelectedECHIDNA() {
        try {
            boolean isSelected = checkBoxECHIDNA.isSelected();
            LoggerUtil.logInfo("ECHIDNA checkbox selected status: " + isSelected);
            return isSelected;
        } catch (Exception e) {
            LoggerUtil.logError("Failed to get ECHIDNA checkbox selected status.", e);
            return false;
        }
    }


}

