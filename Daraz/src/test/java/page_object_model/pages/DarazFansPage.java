
package page_object_model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public void selectAikoCheckBox() {
        aikoCheckBox.click();
    }

    public void selectBrandWarrantyCheckbox() {
        brandWarrantyCheckbox.click();
    }
    public void selectWarrantyPeriodCheckbox() {
        WarrantyPeriodCheckbox.click();
    }

    public boolean isCheckboxSelectedBrandWarranty() {
        return brandWarrantyCheckbox.isSelected();
    }

    public boolean isCheckboxSelectedWarrantyPeriod() {
        return WarrantyPeriodCheckbox.isSelected();
    }

}
