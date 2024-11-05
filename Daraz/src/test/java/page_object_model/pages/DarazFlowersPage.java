package page_object_model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DarazFlowersPage extends BasePage {


    @FindBy(xpath= "//input[@class='ant-checkbox-input' and @businessvalue='echidna-123423045']")
    public WebElement checkBoxECHIDNA;

    @FindBy(xpath= "//input[@class='ant-checkbox-input' and @businessvalue='30129:1577']")
    public WebElement checkBoxRed;

    @FindBy(xpath= "//input[@class='ant-checkbox-input' and @businessvalue='31136:3848']")
    public WebElement checkBoxModernStyle;

    @FindBy(xpath = "//input[@class='ant-checkbox-input' and @businessvalue='40205:159322']")
    public WebElement checkBoxHandWork;

    @FindBy(xpath = "//input[@class='ant-checkbox-input' and @businessvalue='30129:3740']")
    public WebElement checkBoxPurple;

    @FindBy(xpath= "//input[@class='ant-checkbox-input' and @businessvalue='Central']")
    public WebElement shippedFromCentralCheckBox;


    public DarazFlowersPage(WebDriver driver) {
        super(driver);
    }

    public void selectCheckboxECHIDNA() {
        checkBoxECHIDNA.click();
    }

    public void selectCheckBoxRed() {
        checkBoxRed.click();
    }

   public void selectCheckBoxShippedFromCentral(){
        shippedFromCentralCheckBox.click();
    }

    public void selectCheckBoxPurple() {
        checkBoxPurple.click();
    }

    public boolean isCheckBoxSelectedRed() {
        return checkBoxRed.isSelected();
    }

    public boolean isCheckBoxSelectedPurple() {
        return checkBoxPurple.isSelected();
    }

    public boolean isCheckBoxSelectedShippedFromCentral() {
        return shippedFromCentralCheckBox.isSelected();
    }

    public boolean isCheckBoxSelectedECHIDNA() {
        return checkBoxECHIDNA.isSelected();
    }



    //    public void selectCheckBoxModern(){
//        checkBoxModernStyle.click();
//    }
//
//    public void selectCheckBoxHandWork() {
//        checkBoxHandWork.click();
//    }
}

