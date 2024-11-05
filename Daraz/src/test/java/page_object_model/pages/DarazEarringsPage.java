package page_object_model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
        checkBoxBodhi.click();
    }

    public void selectCheckBoxLocalSellerWarranty() {
        checkBoxLocalSellerWarranty.click();
    }

    public void setMaxValue(String maxValue){
         textBoxMaxValue.sendKeys(maxValue);
    }

    public void setMinValue(String minValue){
        textBoxMinValue.sendKeys(minValue);
    }

    public void selectCheckBoxShippedFromWestern(){
        shippedFromWesternCheckBox.click();
    }

    public boolean isCheckboxSelectedVoucherMax() {
        return shippedFromWesternCheckBox.isSelected();
    }
    public boolean isCheckboxSelectedBodhi() {
        return checkBoxBodhi.isSelected();
    }

    public boolean isCheckboxSelectedLocalSellerWarranty() {
        return  checkBoxLocalSellerWarranty.isSelected();
    }

    public String getMinValue() {
        return textBoxMinValue.getAttribute("value");
    }

    public String getMaxValue() {
        return textBoxMaxValue.getAttribute("value");
    }
}
